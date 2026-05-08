package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.util.SparseArray;
import defpackage.e47;
import defpackage.f47;
import defpackage.i47;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sx0 {
    public static final sx0 c = new sx0(e47.n(c.d));

    @SuppressLint({"InlinedApi"})
    public static final qyc d;
    public static final f47<Integer, Integer> e;
    public final SparseArray<c> a = new SparseArray<>();
    public final int b;

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static qyc a(ox0 ox0Var) {
            e47.b bVar = e47.b;
            e47.a aVar = new e47.a();
            f47<Integer, Integer> f47Var = sx0.e;
            i47 i47VarD = f47Var.b;
            if (i47VarD == null) {
                i47VarD = f47Var.d();
                f47Var.b = i47VarD;
            }
            r6g it = i47VarD.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= vjg.r(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), ox0Var.b().a)) {
                    aVar.c(num);
                }
            }
            aVar.c(2);
            return aVar.f();
        }

        public static int b(int i, int i2, ox0 ox0Var) {
            for (int i3 = 10; i3 > 0; i3--) {
                int iS = vjg.s(i3);
                if (iS != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iS).build(), ox0Var.b().a)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    public static final class b {
        public static sx0 a(AudioManager audioManager, ox0 ox0Var) {
            List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(ox0Var.b().a);
            HashMap map = new HashMap();
            map.put(2, new HashSet(bm7.J1(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                AudioProfile audioProfile = directProfilesForAttributes.get(i);
                if (audioProfile.getEncapsulationType() != 1) {
                    int format = audioProfile.getFormat();
                    if (vjg.J(format) || sx0.e.containsKey(Integer.valueOf(format))) {
                        if (map.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) map.get(Integer.valueOf(format));
                            set.getClass();
                            set.addAll(bm7.J1(audioProfile.getChannelMasks()));
                        } else {
                            map.put(Integer.valueOf(format), new HashSet(bm7.J1(audioProfile.getChannelMasks())));
                        }
                    }
                }
            }
            e47.b bVar = e47.b;
            e47.a aVar = new e47.a();
            for (Map.Entry entry : map.entrySet()) {
                aVar.c(new c(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
            }
            return new sx0(aVar.f());
        }

        public static ux0 b(AudioManager audioManager, ox0 ox0Var) {
            audioManager.getClass();
            List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(ox0Var.b().a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new ux0(audioDevicesForAttributes.get(0), 0);
        }
    }

    static {
        Object[] objArr = {2, 5, 6};
        pg8.l(3, objArr);
        d = e47.i(3, objArr);
        f47.a aVar = new f47.a(4);
        aVar.b(5, 6);
        aVar.b(17, 6);
        aVar.b(7, 6);
        aVar.b(30, 10);
        aVar.b(18, 6);
        aVar.b(6, 8);
        aVar.b(8, 8);
        aVar.b(14, 8);
        e = aVar.a();
    }

    public sx0(qyc qycVar) {
        for (int i = 0; i < qycVar.d; i++) {
            c cVar = (c) qycVar.get(i);
            this.a.put(cVar.a, cVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, this.a.valueAt(i2).b);
        }
        this.b = iMax;
    }

    public static qyc a(int i, int[] iArr) {
        e47.b bVar = e47.b;
        e47.a aVar = new e47.a();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            aVar.c(new c(i2, i));
        }
        return aVar.f();
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static sx0 b(Context context, ox0 ox0Var, ux0 ux0Var) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), ox0Var, ux0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    @android.annotation.SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.sx0 c(android.content.Context r11, android.content.Intent r12, defpackage.ox0 r13, defpackage.ux0 r14) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx0.c(android.content.Context, android.content.Intent, ox0, ux0):sx0");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair d(defpackage.ox0 r13, androidx.media3.common.a r14) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx0.d(ox0, androidx.media3.common.a):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx0)) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        return vjg.m(this.a, sx0Var.a) && this.b == sx0Var.b;
    }

    public final int hashCode() {
        return (vjg.n(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }

    public static final class c {
        public static final c d;
        public final int a;
        public final int b;
        public final i47<Integer> c;

        static {
            c cVar;
            if (Build.VERSION.SDK_INT >= 33) {
                i47.a aVar = new i47.a(4);
                for (int i = 1; i <= 10; i++) {
                    aVar.c(Integer.valueOf(vjg.s(i)));
                }
                cVar = new c(2, aVar.f());
            } else {
                cVar = new c(2, 10);
            }
            d = cVar;
        }

        public c(int i, Set<Integer> set) {
            this.a = i;
            i47<Integer> i47VarK = i47.k(set);
            this.c = i47VarK;
            r6g<Integer> it = i47VarK.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.b = iMax;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && Objects.equals(this.c, cVar.c);
        }

        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            i47<Integer> i47Var = this.c;
            return i + (i47Var == null ? 0 : i47Var.hashCode());
        }

        public final String toString() {
            return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
        }

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = null;
        }
    }
}
