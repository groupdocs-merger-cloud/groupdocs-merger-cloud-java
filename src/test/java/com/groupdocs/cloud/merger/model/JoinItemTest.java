package com.groupdocs.cloud.merger.model;

import com.groupdocs.cloud.merger.client.JSON;
import org.junit.Assert;
import org.junit.Test;

public class JoinItemTest {
    @Test
    public void testPreserveAccessibilitySerialization() {
        JoinItem item = new JoinItem();
        item.setPreserveAccessibility(true);
        JSON json = new JSON();
        String serialized = json.serialize(item);
        JoinItem deserialized = json.deserialize(serialized, JoinItem.class);
        Assert.assertTrue(deserialized.getPreserveAccessibility());
    }
}
