package chapter08.readOneTimes.trycatch;

/*
페이지 437
자동 자원 반환 - try-with-resources문
 */
public class TryWithResourceEx {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false); // 예외가 발생하지 않는다.
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true); // 예외가 발생한다.
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
    }
}

class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exception(" + exception + ")가 호출됨");

        if (exception)
            throw new WorkException("WorkException 발생!!");
    }

    @Override
    public void close() throws CloseException {
        System.out.println("close() 가 호출됨");
        throw new CloseException("CloseException 발생!!");
    }
}

class WorkException extends Exception {
    public WorkException(String message) {
        super(message);
    }
}

class CloseException extends Exception {
    public CloseException(String message) {
        super(message);
    }
}