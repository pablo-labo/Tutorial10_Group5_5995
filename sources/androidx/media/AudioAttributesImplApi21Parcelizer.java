package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import defpackage.eng;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(eng engVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        Parcelable parcelableK = audioAttributesImplApi21.a;
        if (engVar.h(1)) {
            parcelableK = engVar.k();
        }
        audioAttributesImplApi21.a = (AudioAttributes) parcelableK;
        audioAttributesImplApi21.b = engVar.j(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, eng engVar) {
        engVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        engVar.n(1);
        engVar.t(audioAttributes);
        engVar.s(audioAttributesImplApi21.b, 2);
    }
}
