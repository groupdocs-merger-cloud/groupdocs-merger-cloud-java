package com.groupdocs.cloud.merger.model;

import com.groupdocs.cloud.merger.client.JSON;
import org.junit.Assert;
import org.junit.Test;

public class PreviewOptionsTest {
    @Test
    public void testResolutionSerialization() {
        PreviewOptions options = new PreviewOptions();
        options.setResolution(300);
        JSON json = new JSON();
        String serialized = json.serialize(options);
        PreviewOptions deserialized = json.deserialize(serialized, PreviewOptions.class);
        Assert.assertEquals(Integer.valueOf(300), deserialized.getResolution());
    }
}
