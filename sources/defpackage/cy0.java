package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.e;
import defpackage.dy0;

/* JADX INFO: loaded from: classes.dex */
public final class cy0 {
    public final fze<AudioManager> a;
    public final Handler b;
    public e c;
    public ox0 d;
    public int f;
    public dy0 h;
    public float g = 1.0f;
    public int e = 0;

    public cy0(final Context context, Looper looper, e eVar) {
        this.a = kze.a(new fze() { // from class: xx0
            @Override // defpackage.fze
            public final Object get() {
                return ey0.a(context);
            }
        });
        this.c = eVar;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = this.a.get();
        AudioFocusRequest audioFocusRequest = this.h.f;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void b(int i) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.W.g(33, i, 0).b();
        }
    }

    public final void c(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        e eVar = this.c;
        if (eVar != null) {
            eVar.W.k(34);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [wx0] */
    public final int d(int i, boolean z) {
        int i2;
        dy0.a aVar;
        boolean z2 = false;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            c(0);
            return 1;
        }
        int i3 = this.e;
        if (z) {
            if (i3 != 2) {
                dy0 dy0Var = this.h;
                if (dy0Var == null) {
                    if (dy0Var == null) {
                        aVar = new dy0.a();
                        aVar.b = ox0.h;
                        aVar.a = i2;
                    } else {
                        dy0.a aVar2 = new dy0.a();
                        aVar2.a = dy0Var.a;
                        aVar2.b = dy0Var.d;
                        aVar2.c = dy0Var.e;
                        aVar = aVar2;
                    }
                    ox0 ox0Var = this.d;
                    if (ox0Var != null && ox0Var.a == 1) {
                        z2 = true;
                    }
                    ox0Var.getClass();
                    aVar.b = ox0Var;
                    aVar.c = z2;
                    ?? r6 = new AudioManager.OnAudioFocusChangeListener() { // from class: wx0
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i4) {
                            ox0 ox0Var2;
                            cy0 cy0Var = this.a;
                            cy0Var.getClass();
                            if (i4 == -3 || i4 == -2) {
                                if (i4 != -2 && ((ox0Var2 = cy0Var.d) == null || ox0Var2.a != 1)) {
                                    cy0Var.c(4);
                                    return;
                                } else {
                                    cy0Var.b(0);
                                    cy0Var.c(3);
                                    return;
                                }
                            }
                            if (i4 == -1) {
                                cy0Var.b(-1);
                                cy0Var.a();
                                cy0Var.c(1);
                            } else if (i4 != 1) {
                                g7.j(i4, "Unknown focus change type: ", "AudioFocusManager");
                            } else {
                                cy0Var.c(2);
                                cy0Var.b(1);
                            }
                        }
                    };
                    Handler handler = this.b;
                    handler.getClass();
                    this.h = new dy0(aVar.a, r6, handler, aVar.b, aVar.c);
                }
                AudioManager audioManager = this.a.get();
                AudioFocusRequest audioFocusRequest = this.h.f;
                audioFocusRequest.getClass();
                if (audioManager.requestAudioFocus(audioFocusRequest) == 1) {
                    c(2);
                    return 1;
                }
                c(1);
                return -1;
            }
        } else {
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
