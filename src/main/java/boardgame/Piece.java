package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; //essa posição inicial pode ser nulo, o java cria automaticamente caso eu não declare como null
    }

    //apenas com o metodo getBoard, sem set para o board
    protected Board getBoard() {
        return board;
    }


}
