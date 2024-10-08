package src.utilities;

import src.Main;

public class NoStackTraceThrowable extends RuntimeException {

    public NoStackTraceThrowable(final String msg) {
        super(msg);
        this.setStackTrace(new StackTraceElement[0]);
    }

    @Override
    public String toString() {
        return "" + Main.getVersion();
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}