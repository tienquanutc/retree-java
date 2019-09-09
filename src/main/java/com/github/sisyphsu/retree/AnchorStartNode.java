package com.github.sisyphsu.retree;

/**
 * This node support '^' and '\A'
 *
 * @author sulin
 * @since 2019-08-26 11:10:27
 */
public final class AnchorStartNode extends Node {

    @Override
    public boolean match(ReContext cxt) {
        if (cxt.cursor != cxt.from) {
            return false;
        }
        return next.match(cxt);
    }

    @Override
    public boolean alike(Node node) {
        return node instanceof AnchorStartNode;
    }

}
