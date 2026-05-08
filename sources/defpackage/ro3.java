package defpackage;

import defpackage.kv8;

/* JADX INFO: loaded from: classes.dex */
public final class ro3 implements uv8 {
    public final qo3 a;
    public final uv8 b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kv8.a.values().length];
            try {
                iArr[kv8.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kv8.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kv8.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kv8.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kv8.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kv8.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[kv8.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public ro3(qo3 qo3Var, uv8 uv8Var) {
        qo3Var.getClass();
        this.a = qo3Var;
        this.b = uv8Var;
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        int i = a.a[aVar.ordinal()];
        qo3 qo3Var = this.a;
        switch (i) {
            case 1:
                qo3Var.onCreate(zv8Var);
                break;
            case 2:
                qo3Var.onStart(zv8Var);
                break;
            case 3:
                qo3Var.onResume(zv8Var);
                break;
            case 4:
                qo3Var.onPause(zv8Var);
                break;
            case 5:
                qo3Var.onStop(zv8Var);
                break;
            case 6:
                qo3Var.onDestroy(zv8Var);
                break;
            case 7:
                l5.q("ON_ANY must not been send by anybody");
                return;
            default:
                l.g();
                return;
        }
        uv8 uv8Var = this.b;
        if (uv8Var != null) {
            uv8Var.G(zv8Var, aVar);
        }
    }
}
