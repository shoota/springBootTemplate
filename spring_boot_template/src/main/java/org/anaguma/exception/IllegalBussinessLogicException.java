package org.anaguma.exception;

public class IllegalBussinessLogicException extends Exception {
    private static final long serialVersionUID = -7838104423266712033L;

    public IllegalBussinessLogicException() {
        super();
    }

    public IllegalBussinessLogicException(String string) {
        super(string);
    }

    public IllegalBussinessLogicException(String paramString, Throwable paramThrowable) {
        super(paramString, paramThrowable);
    }

    public IllegalBussinessLogicException(Throwable paramThrowable) {
        super(paramThrowable);
    }

}
