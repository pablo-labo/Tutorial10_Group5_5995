package defpackage;

import android.os.Build;
import com.infra.eventlogger.model.DeviceProperties;
import com.infra.eventlogger.model.avro.NullableString;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a44 {
    public static final a Companion = new a();
    public String a;
    public String b;
    public String c;
    public String d;

    public static final class a {

        /* JADX INFO: renamed from: a44$a$a, reason: collision with other inner class name */
        public static final class C0001a extends mj8 implements Function1<a44, j6g> {
            final /* synthetic */ hz4 $config;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0001a(hz4 hz4Var) {
                super(1);
                this.$config = hz4Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public final j6g invoke(a44 a44Var) {
                a44 a44Var2 = a44Var;
                a44Var2.getClass();
                a44Var2.a = "ANDROID";
                a44Var2.b = Build.MANUFACTURER;
                a44Var2.c = Build.PRODUCT;
                a44Var2.d = this.$config.o;
                return j6g.a;
            }
        }

        public static a44 a(hz4 hz4Var, Function1 function1) {
            hz4Var.getClass();
            function1.getClass();
            C0001a c0001a = new C0001a(hz4Var);
            a44 a44Var = new a44();
            c0001a.invoke(a44Var);
            function1.invoke(a44Var);
            return a44Var;
        }
    }

    public final DeviceProperties a() {
        NullableString nullableString;
        NullableString nullableString2;
        String str = this.a;
        NullableString nullableString3 = null;
        if (str == null) {
            r6.g("Required value was null.");
            return null;
        }
        if (this.b == null) {
            nullableString = null;
        } else {
            String str2 = this.b;
            str2.getClass();
            nullableString = new NullableString(str2);
        }
        if (this.c == null) {
            nullableString2 = null;
        } else {
            String str3 = this.c;
            str3.getClass();
            nullableString2 = new NullableString(str3);
        }
        if (this.d != null) {
            String str4 = this.d;
            str4.getClass();
            nullableString3 = new NullableString(str4);
        }
        return new DeviceProperties(str, nullableString, nullableString2, nullableString3);
    }
}
