package com.deeplake.adven2.util;

import java.util.ArrayList;
import java.util.List;

import com.deeplake.adven2.Idealland;
import com.deeplake.adven2.util.sound.ModSoundEvent;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSoundHandler {
    //To add a sound, remember assets.adven2.sounds.json
    public static final List<ModSoundEvent> SOUNDS = new ArrayList<>();

//    public static SoundEvent SOUND_1 = new ModSoundEvent("entity.moroon.ambient");
//    public static SoundEvent SOUND_2 = new ModSoundEvent("entity.moroon.hurt");

    public static void soundRegister()
    {
        Idealland.Log("Registering %s sounds.", SOUNDS.size());
        ForgeRegistries.SOUND_EVENTS.registerAll(ModSoundHandler.SOUNDS.toArray(new SoundEvent[0]));
        Idealland.Log("Registered %s sounds.", SOUNDS.size());
    }

}
