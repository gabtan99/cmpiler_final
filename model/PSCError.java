package model;

public class PSCError {

    private int line;
    private int charPosition;
    private String msg;

    public PSCError(int line, int charPosition) {
        this.line = line;
        this.charPosition = charPosition;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCharPosition(int charPosition) {
        this.charPosition = charPosition;
    }

    public String getFullError() {
        return "Line " + this.line + ":" + this.charPosition + " - " + this.msg;
    }

}