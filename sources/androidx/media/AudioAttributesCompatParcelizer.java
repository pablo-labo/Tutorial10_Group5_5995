package androidx.media;

import defpackage.eng;
import defpackage.gng;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(eng engVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        gng gngVarM = audioAttributesCompat.a;
        if (engVar.h(1)) {
            gngVarM = engVar.m();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) gngVarM;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, eng engVar) {
        engVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        engVar.n(1);
        engVar.v(audioAttributesImpl);
    }
}
