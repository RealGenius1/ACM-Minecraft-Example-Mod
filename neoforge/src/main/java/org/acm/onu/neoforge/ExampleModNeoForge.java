package org.acm.onu.neoforge;

import net.neoforged.fml.common.Mod;

import org.acm.onu.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
