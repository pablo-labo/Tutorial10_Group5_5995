package androidx.media;

import defpackage.eng;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(eng engVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = engVar.j(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = engVar.j(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = engVar.j(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = engVar.j(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, eng engVar) {
        engVar.getClass();
        engVar.s(audioAttributesImplBase.a, 1);
        engVar.s(audioAttributesImplBase.b, 2);
        engVar.s(audioAttributesImplBase.c, 3);
        engVar.s(audioAttributesImplBase.d, 4);
    }
}
