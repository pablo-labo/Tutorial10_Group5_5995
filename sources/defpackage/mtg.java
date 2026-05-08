package defpackage;

import android.media.VolumeProvider;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class mtg {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;

    public mtg(String str, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public final VolumeProvider a() {
        mtg mtgVar;
        if (this.e != null) {
            mtgVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            mtgVar = this;
            mtgVar.e = new ktg(mtgVar, this.a, this.b, this.d, this.c);
        } else {
            mtgVar = this;
            mtgVar.e = new ltg(mtgVar, mtgVar.a, mtgVar.b, mtgVar.d);
        }
        return mtgVar.e;
    }
}
