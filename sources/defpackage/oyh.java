package defpackage;

import com.google.android.gms.internal.play_billing.b;
import defpackage.oyh;
import defpackage.vxh;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oyh<MessageType extends oyh<MessageType, BuilderType>, BuilderType extends vxh<MessageType, BuilderType>> extends pth<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected c5i zzc = c5i.f;

    public static final boolean b(oyh oyhVar, boolean z) {
        byte bByteValue = ((Byte) oyhVar.e(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = y2i.c.a(oyhVar.getClass()).c(oyhVar);
        if (z) {
            oyhVar.e(2);
        }
        return zC;
    }

    public static oyh f(Class cls) {
        Map map = zzb;
        oyh oyhVar = (oyh) map.get(cls);
        if (oyhVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                oyhVar = (oyh) map.get(cls);
            } catch (ClassNotFoundException e) {
                ja.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (oyhVar != null) {
            return oyhVar;
        }
        oyh oyhVar2 = (oyh) ((oyh) t5i.g(cls)).e(6);
        if (oyhVar2 != null) {
            map.put(cls, oyhVar2);
            return oyhVar2;
        }
        bg.h();
        return null;
    }

    public static Object g(Method method, oyh oyhVar, Object... objArr) {
        try {
            return method.invoke(oyhVar, objArr);
        } catch (IllegalAccessException e) {
            l6.p("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            l6.p("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static void j(Class cls, oyh oyhVar) {
        oyhVar.i();
        zzb.put(cls, oyhVar);
    }

    @Override // defpackage.pth
    public final int a(i3i i3iVar) {
        if (l()) {
            int iE = i3iVar.e(this);
            if (iE >= 0) {
                return iE;
            }
            r6.g(p6.c(iE, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iE2 = i3iVar.e(this);
        if (iE2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iE2;
            return iE2;
        }
        r6.g(p6.c(iE2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // defpackage.f2i
    public final /* synthetic */ c2i c() {
        return (vxh) e(5);
    }

    @Override // defpackage.f2i
    public final void d(b bVar) {
        i3i i3iVarA = y2i.c.a(getClass());
        wvh wvhVar = bVar.a;
        if (wvhVar == null) {
            wvhVar = new wvh(bVar);
        }
        i3iVarA.a(this, wvhVar);
    }

    public abstract Object e(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return y2i.c.a(getClass()).b(this, (oyh) obj);
    }

    public final void h() {
        y2i.c.a(getClass()).zzf(this);
        i();
    }

    public final int hashCode() {
        if (l()) {
            return y2i.c.a(getClass()).d(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iD = y2i.c.a(getClass()).d(this);
        this.zza = iD;
        return iD;
    }

    public final void i() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void k() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean l() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = l2i.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        l2i.c(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.i2i
    public final /* synthetic */ oyh zzh() {
        return (oyh) e(6);
    }

    @Override // defpackage.f2i
    public final int zzj() {
        if (l()) {
            int iE = y2i.c.a(getClass()).e(this);
            if (iE >= 0) {
                return iE;
            }
            r6.g(p6.c(iE, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iE2 = y2i.c.a(getClass()).e(this);
        if (iE2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iE2;
            return iE2;
        }
        r6.g(p6.c(iE2, "serialized size must be non-negative, was "));
        return 0;
    }
}
