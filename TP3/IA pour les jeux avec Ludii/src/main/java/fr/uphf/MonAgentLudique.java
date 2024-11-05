package fr.uphf;

import game.Game;
import main.collections.FastArrayList;
import other.AI;
import other.context.Context;
import other.move.Move;


public class MonAgentLudique extends AI {
    //-------------------------------------------------------------------------

    /** Our player index */
    protected int player = -1;

    //-------------------------------------------------------------------------

    /**
     * Constructor
     */
    public MonAgentLudique()
    {
        this.friendlyName = "Mon Agent Hasardeux";
    }

    @Override
    public Move selectAction(Game game, Context context, double maxSeconds, int maxIterations, int maxDepth) {
        FastArrayList<Move> legalMoves = game.moves(context ).moves();

        return legalMoves.get((int)(Math.random()*legalMoves.size()));
    }

    @Override
    public void initAI(final Game game, final int playerID)
    {
        this.player = playerID;
    }
}
