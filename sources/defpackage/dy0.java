package defpackage;

import android.media.AudioFocusRequest;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dy0 {
    public final int a;
    public final wx0 b;
    public final Handler c;
    public final ox0 d;
    public final boolean e;
    public final AudioFocusRequest f;

    public static final class a {
        public int a;
        public ox0 b;
        public boolean c;
    }

    public dy0(int i, wx0 wx0Var, Handler handler, ox0 ox0Var, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = ox0Var;
        this.e = z;
        this.b = wx0Var;
        this.f = new AudioFocusRequest.Builder(i).setAudioAttributes(ox0Var.b().a).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(wx0Var, handler).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy0)) {
            return false;
        }
        dy0 dy0Var = (dy0) obj;
        return this.a == dy0Var.a && this.e == dy0Var.e && equals(dy0Var.b) && Objects.equals(this.c, dy0Var.c) && Objects.equals(this.d, dy0Var.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
