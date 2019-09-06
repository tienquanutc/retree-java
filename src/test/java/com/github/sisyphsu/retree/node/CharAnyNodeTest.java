package com.github.sisyphsu.retree.node;

import org.junit.jupiter.api.Test;

/**
 * Perfect CharAnyNode's test coverage
 *
 * @author sulin
 * @since 2019-09-06 20:09:22
 */
public class CharAnyNodeTest {

    @Test
    public void alike() {
        CharAnyNode node1 = new CharAnyNode();
        CharAnyNode node2 = new CharAnyNode();
        assert node1.alike(node2);

        node1.complement();
        assert !node1.alike(node2);

        assert !node1.alike(new CharSingleNode(1));

        assert node1.toString().equals(".");
    }

}