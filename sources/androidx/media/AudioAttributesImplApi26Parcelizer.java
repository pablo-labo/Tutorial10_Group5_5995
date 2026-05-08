package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import defpackage.eng;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(eng engVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        Parcelable parcelableK = audioAttributesImplApi26.a;
        if (engVar.h(1)) {
            parcelableK = engVar.k();
        }
        audioAttributesImplApi26.a = (AudioAttributes) parcelableK;
        audioAttributesImplApi26.b = engVar.j(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, eng engVar) {
        engVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.a;
        engVar.n(1);
        engVar.t(audioAttributes);
        engVar.s(audioAttributesImplApi26.b, 2);
    }
}
