package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.e;
import defpackage.kv8;
import defpackage.rzg;

/* JADX INFO: loaded from: classes3.dex */
public final class dee implements uv8, tpa {
    public final com.swmansion.rnscreens.a a;
    public boolean b;
    public v1 c = eh8.b;
    public int d;
    public final b e;
    public final a f;

    public final class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view, int i) {
            if (i == 4 && rzg.h(null, view.getRootWindowInsets()).a.q(8)) {
                view.requestFocus();
                ((InputMethodManager) dee.this.a.getReactContext().getSystemService(InputMethodManager.class)).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    public final class b extends BottomSheetBehavior.c {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view, int i) {
            dee deeVar = dee.this;
            com.swmansion.rnscreens.a aVar = deeVar.a;
            int i2 = 1;
            boolean z = i == 3 || i == 4 || i == 5 || i == 6;
            if (z) {
                int size = aVar.getSheetDetents().size();
                if (size == 1) {
                    if (i != 3) {
                        if (i != 5) {
                            l5.q(k20.l("[RNScreens] Invalid state ", i, size, " for detentCount "));
                            return;
                        }
                        i2 = -1;
                    }
                    i2 = 0;
                } else if (size != 2) {
                    if (size != 3) {
                        l5.q(k20.l("[RNScreens] Invalid state ", i, size, " for detentCount "));
                        return;
                    }
                    if (i == 3) {
                        i2 = 2;
                    } else if (i == 4) {
                        i2 = 0;
                    } else if (i == 5) {
                        i2 = -1;
                    } else if (i != 6) {
                        l5.q(k20.l("[RNScreens] Invalid state ", i, size, " for detentCount "));
                        return;
                    }
                } else if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            l5.q(k20.l("[RNScreens] Invalid state ", i, size, " for detentCount "));
                            return;
                        }
                        i2 = -1;
                    }
                    i2 = 0;
                }
                deeVar.d = i2;
            }
            int i3 = deeVar.d;
            int iG = dmc.g(aVar.e);
            EventDispatcher reactEventDispatcher = aVar.getReactEventDispatcher();
            if (reactEventDispatcher != null) {
                reactEventDispatcher.a(new eee(iG, aVar.getId(), i3, z));
            }
            if (z) {
                aVar.b(aVar.getWidth(), aVar.getHeight(), aVar.getTop());
            }
            if (i == 5) {
                Fragment fragment = aVar.getFragment();
                fragment.getClass();
                ((e) fragment).J();
            }
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kv8.a.values().length];
            try {
                iArr[kv8.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kv8.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kv8.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public dee(com.swmansion.rnscreens.a aVar) {
        this.a = aVar;
        this.d = aVar.getSheetInitialDetentIndex();
        zkd.J(aVar.getSheetInitialDetentIndex(), aVar.getSheetDetents().size());
        b bVar = new b();
        this.e = bVar;
        this.f = new a();
        aVar.getFragment();
        Fragment fragment = aVar.getFragment();
        fragment.getClass();
        fragment.getLifecycle().a(this);
        BottomSheetBehavior<com.swmansion.rnscreens.a> sheetBehavior = aVar.getSheetBehavior();
        if (sheetBehavior != null) {
            sheetBehavior.s(bVar);
        } else {
            r6.g("[RNScreens] Sheet delegate accepts screen with initialized sheet behaviour only.");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(defpackage.dee r12, com.google.android.material.bottomsheet.BottomSheetBehavior r13, defpackage.v1 r14, int r15) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dee.a(dee, com.google.android.material.bottomsheet.BottomSheetBehavior, v1, int):void");
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        int i = c.a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                nf7.b.add(this);
                return;
            } else {
                if (i != 3) {
                    return;
                }
                nf7.b.remove(this);
                return;
            }
        }
        nf7 nf7Var = nf7.a;
        Activity currentActivity = this.a.getReactContext().a.getCurrentActivity();
        if (currentActivity == null) {
            r6.g("[RNScreens] Attempt to access activity on detached context");
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        decorView.getClass();
        nf7Var.a(decorView);
    }

    @Override // defpackage.tpa
    public final rzg b(View view, rzg rzgVar) {
        view.getClass();
        rzg.j jVar = rzgVar.a;
        boolean zQ = jVar.q(8);
        jVar.g(8).getClass();
        com.swmansion.rnscreens.a aVar = this.a;
        if (zQ) {
            this.b = true;
            this.c = new ih8();
            BottomSheetBehavior<com.swmansion.rnscreens.a> sheetBehavior = aVar.getSheetBehavior();
            if (sheetBehavior != null) {
                a(this, sheetBehavior, this.c, 4);
            }
            kf7 kf7VarG = jVar.g(2);
            kf7VarG.getClass();
            int i = Build.VERSION.SDK_INT;
            rzg.d cVar = i >= 30 ? new rzg.c(rzgVar) : i >= 29 ? new rzg.b(rzgVar) : new rzg.a(rzgVar);
            cVar.c(2, kf7.b(kf7VarG.a, kf7VarG.b, kf7VarG.c, 0));
            rzg rzgVarB = cVar.b();
            rzgVarB.getClass();
            return rzgVarB;
        }
        BottomSheetBehavior<com.swmansion.rnscreens.a> sheetBehavior2 = aVar.getSheetBehavior();
        if (sheetBehavior2 != null) {
            if (this.b) {
                a(this, sheetBehavior2, ah8.b, 4);
            } else {
                v1 v1Var = this.c;
                eh8 eh8Var = eh8.b;
                if (!wl7.b(v1Var, eh8Var)) {
                    a(this, sheetBehavior2, eh8Var, 4);
                }
            }
        }
        this.c = eh8.b;
        this.b = false;
        kf7 kf7VarG2 = jVar.g(2);
        kf7VarG2.getClass();
        int i2 = Build.VERSION.SDK_INT;
        rzg.d cVar2 = i2 >= 30 ? new rzg.c(rzgVar) : i2 >= 29 ? new rzg.b(rzgVar) : new rzg.a(rzgVar);
        cVar2.c(2, kf7.b(kf7VarG2.a, kf7VarG2.b, kf7VarG2.c, 0));
        rzg rzgVarB2 = cVar2.b();
        rzgVarB2.getClass();
        return rzgVarB2;
    }
}
