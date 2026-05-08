package defpackage;

import android.os.Bundle;
import android.os.Trace;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luo7;", "Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class uo7 extends sx9 {
    public d49 c;

    public static final class a extends f39 {
        public final WeakReference<uo7> a;

        public a(uo7 uo7Var) {
            this.a = new WeakReference<>(uo7Var);
        }

        @Override // defpackage.f39
        public final void a(o39 o39Var, String str, Throwable th) {
            String str2;
            if (th != null) {
                str = z3.m(str, ". ", th.getMessage());
            }
            uo7 uo7Var = this.a.get();
            if (uo7Var != null) {
                switch (o39Var) {
                    case Trace:
                    case Stacktrace:
                        str2 = "ExpoModulesCoreJSLogger.onNewTrace";
                        break;
                    case Timer:
                    case Debug:
                        str2 = "ExpoModulesCoreJSLogger.onNewDebug";
                        break;
                    case Info:
                        str2 = "ExpoModulesCoreJSLogger.onNewInfo";
                        break;
                    case Warn:
                        str2 = "ExpoModulesCoreJSLogger.onNewWarning";
                        break;
                    case Error:
                    case Fatal:
                        str2 = "ExpoModulesCoreJSLogger.onNewError";
                        break;
                    default:
                        l.g();
                        return;
                }
                Bundle bundleE = l6.e("message", str);
                j6g j6gVar = j6g.a;
                uo7Var.d(str2, bundleE);
            }
        }
    }

    public static final class b implements gu5<j6g> {
        public b() {
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            uo7 uo7Var = uo7.this;
            uo7Var.c = new d49(u63.Z(new a(uo7Var)));
            return j6g.a;
        }
    }

    @Override // defpackage.sx9
    public final wx9 a() {
        Trace.beginSection(jpf.g("[ExpoModulesCore] ".concat(uo7.class + ".ModuleDefinition")));
        try {
            vx9 vx9Var = new vx9(this, 2);
            vx9Var.l = "ExpoModulesCoreJSLogger";
            vx9Var.b("ExpoModulesCoreJSLogger.onNewError", "ExpoModulesCoreJSLogger.onNewWarning", "ExpoModulesCoreJSLogger.onNewDebug", "ExpoModulesCoreJSLogger.onNewInfo", "ExpoModulesCoreJSLogger.onNewTrace");
            LinkedHashMap linkedHashMap = vx9Var.n;
            i05 i05Var = i05.a;
            linkedHashMap.put(i05Var, new nc1(i05Var, new b()));
            return vx9Var.k();
        } finally {
            Trace.endSection();
        }
    }
}
