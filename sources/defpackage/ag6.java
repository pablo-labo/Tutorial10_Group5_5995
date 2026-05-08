package defpackage;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.os.Trace;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.haptics.HapticType;
import expo.modules.kotlin.exception.Exceptions$ReactContextLost;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lag6;", "Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "expo-haptics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ag6 extends sx9 {

    public static final class a implements Function1<Object[], Boolean> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            HapticType hapticType = (HapticType) objArr2[0];
            Activity activityB = ag6.this.b().b();
            View viewFindViewById = activityB != null ? activityB.findViewById(R.id.content) : null;
            if (viewFindViewById != null) {
                return Boolean.valueOf(viewFindViewById.performHapticFeedback(hapticType.toHapticFeedbackType()));
            }
            return null;
        }
    }

    public static final class b implements Function2<Object[], p3c, j6g> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws Exceptions$ReactContextLost {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            ag6.e(ag6.this, bg6.a((String) p3cVar2));
            return j6g.a;
        }
    }

    public static final class c implements gu5<zf8> {
        public static final c a = new c();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class d implements Function1<Object[], j6g> {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) throws Exceptions$ReactContextLost {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ag6.e(ag6.this, bg6.a((String) objArr2[0]));
            return j6g.a;
        }
    }

    public static final class e implements Function1<Object[], j6g> {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) throws Exceptions$ReactContextLost {
            objArr.getClass();
            ag6.e(ag6.this, cg6.a);
            return j6g.a;
        }
    }

    public static final class f implements Function2<Object[], p3c, j6g> {
        public f() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws Exceptions$ReactContextLost {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            ag6.e(ag6.this, zf6.a((String) p3cVar2));
            return j6g.a;
        }
    }

    public static final class g implements gu5<zf8> {
        public static final g a = new g();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class h implements Function1<Object[], j6g> {
        public h() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) throws Exceptions$ReactContextLost {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            ag6.e(ag6.this, zf6.a((String) objArr2[0]));
            return j6g.a;
        }
    }

    public static final class i implements Function2<Object[], p3c, j6g> {
        public i() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            HapticType hapticType = (HapticType) p3cVar2;
            Activity activityB = ag6.this.b().b();
            View viewFindViewById = activityB != null ? activityB.findViewById(R.id.content) : null;
            if (viewFindViewById != null) {
                viewFindViewById.performHapticFeedback(hapticType.toHapticFeedbackType());
            }
            return j6g.a;
        }
    }

    public static final class j implements gu5<zf8> {
        public static final j a = new j();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(HapticType.class);
        }
    }

    public static final void e(ag6 ag6Var, dg6 dg6Var) throws Exceptions$ReactContextLost {
        Vibrator defaultVibrator;
        if (Build.VERSION.SDK_INT >= 31) {
            ReactApplicationContext reactApplicationContextD = ag6Var.b().d();
            if (reactApplicationContextD == null) {
                throw new Exceptions$ReactContextLost();
            }
            Object systemService = reactApplicationContextD.getSystemService("vibrator_manager");
            systemService.getClass();
            defaultVibrator = q6.e(systemService).getDefaultVibrator();
            defaultVibrator.getClass();
        } else {
            ReactApplicationContext reactApplicationContextD2 = ag6Var.b().d();
            if (reactApplicationContextD2 == null) {
                throw new Exceptions$ReactContextLost();
            }
            Object systemService2 = reactApplicationContextD2.getSystemService("vibrator");
            systemService2.getClass();
            defaultVibrator = (Vibrator) systemService2;
        }
        defaultVibrator.vibrate(VibrationEffect.createWaveform(dg6Var.a, dg6Var.b, -1));
    }

    @Override // defpackage.sx9
    public final wx9 a() {
        vx9 vx9Var;
        qf0 ch7Var;
        qf0 ch7Var2;
        qf0 o7gVar;
        Trace.beginSection(jpf.g("[ExpoModulesCore] ".concat(ag6.class + ".ModuleDefinition")));
        try {
            vx9 vx9Var2 = new vx9(this, 2);
            LinkedHashMap linkedHashMap = vx9Var2.f;
            vx9Var2.l = "ExpoHaptics";
            boolean zEquals = String.class.equals(p3c.class);
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            if (zEquals) {
                ch7Var = new ev0("notificationAsync", new rf0[0], new b());
                vx9Var = vx9Var2;
            } else {
                hb9 hb9Var = tf0.a;
                iwc iwcVar = fwc.a;
                rf0 rf0Var = (rf0) tf0.a.get(new Pair(iwcVar.b(String.class), Boolean.FALSE));
                if (rf0Var == null) {
                    vx9Var = vx9Var2;
                    rf0Var = new rf0(new xp8(iwcVar.b(String.class), false, c.a), null);
                } else {
                    vx9Var = vx9Var2;
                }
                rf0[] rf0VarArr = {rf0Var};
                d dVar = new d();
                ch7Var = j6g.class.equals(cls) ? new ch7("notificationAsync", rf0VarArr, dVar) : j6g.class.equals(cls4) ? new hi1("notificationAsync", rf0VarArr, dVar) : j6g.class.equals(cls3) ? new s84("notificationAsync", rf0VarArr, dVar) : j6g.class.equals(cls2) ? new ci5("notificationAsync", rf0VarArr, dVar) : j6g.class.equals(String.class) ? new zue("notificationAsync", rf0VarArr, dVar) : new o7g("notificationAsync", rf0VarArr, dVar);
            }
            linkedHashMap.put("notificationAsync", ch7Var);
            rf0[] rf0VarArr2 = new rf0[0];
            e eVar = new e();
            linkedHashMap.put("selectionAsync", j6g.class.equals(cls) ? new ch7("selectionAsync", rf0VarArr2, eVar) : j6g.class.equals(cls4) ? new hi1("selectionAsync", rf0VarArr2, eVar) : j6g.class.equals(cls3) ? new s84("selectionAsync", rf0VarArr2, eVar) : j6g.class.equals(cls2) ? new ci5("selectionAsync", rf0VarArr2, eVar) : j6g.class.equals(String.class) ? new zue("selectionAsync", rf0VarArr2, eVar) : new o7g("selectionAsync", rf0VarArr2, eVar));
            if (String.class.equals(p3c.class)) {
                ch7Var2 = new ev0("impactAsync", new rf0[0], new f());
            } else {
                hb9 hb9Var2 = tf0.a;
                iwc iwcVar2 = fwc.a;
                rf0 rf0Var2 = (rf0) tf0.a.get(new Pair(iwcVar2.b(String.class), Boolean.FALSE));
                if (rf0Var2 == null) {
                    rf0Var2 = new rf0(new xp8(iwcVar2.b(String.class), false, g.a), null);
                }
                rf0[] rf0VarArr3 = {rf0Var2};
                h hVar = new h();
                ch7Var2 = j6g.class.equals(cls) ? new ch7("impactAsync", rf0VarArr3, hVar) : j6g.class.equals(cls4) ? new hi1("impactAsync", rf0VarArr3, hVar) : j6g.class.equals(cls3) ? new s84("impactAsync", rf0VarArr3, hVar) : j6g.class.equals(cls2) ? new ci5("impactAsync", rf0VarArr3, hVar) : j6g.class.equals(String.class) ? new zue("impactAsync", rf0VarArr3, hVar) : new o7g("impactAsync", rf0VarArr3, hVar);
            }
            linkedHashMap.put("impactAsync", ch7Var2);
            if (HapticType.class.equals(p3c.class)) {
                o7gVar = new ev0("performHapticsAsync", new rf0[0], new i());
            } else {
                hb9 hb9Var3 = tf0.a;
                iwc iwcVar3 = fwc.a;
                rf0 rf0Var3 = (rf0) tf0.a.get(new Pair(iwcVar3.b(HapticType.class), Boolean.FALSE));
                if (rf0Var3 == null) {
                    rf0Var3 = new rf0(new xp8(iwcVar3.b(HapticType.class), false, j.a), null);
                }
                o7gVar = new o7g("performHapticsAsync", new rf0[]{rf0Var3}, new a());
            }
            linkedHashMap.put("performHapticsAsync", o7gVar);
            return vx9Var.k();
        } finally {
            Trace.endSection();
        }
    }
}
