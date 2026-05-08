package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import com.infra.eventlogger.model.EventProperties;
import com.infra.eventlogger.model.avro.NullableString;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class m05 {
    public static final a Companion = new a();
    public vk0 a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public Long m;
    public List<String> n;
    public String o;
    public String p;
    public String q;
    public String r;
    public bna s;

    public static final class a {

        /* JADX INFO: renamed from: m05$a$a, reason: collision with other inner class name */
        public static final class C0311a extends mj8 implements Function1<m05, j6g> {
            final /* synthetic */ hz4 $config;
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0311a(hz4 hz4Var, Context context) {
                super(1);
                this.$config = hz4Var;
                this.$context = context;
            }

            @Override // kotlin.jvm.functions.Function1
            public final j6g invoke(m05 m05Var) {
                m05 m05Var2 = m05Var;
                m05Var2.getClass();
                hz4 hz4Var = this.$config;
                m05Var2.a = hz4Var.a;
                m05Var2.b = hz4Var.b;
                m05Var2.c = Integer.valueOf(hz4Var.c);
                hz4 hz4Var2 = this.$config;
                m05Var2.d = hz4Var2.d;
                m05Var2.e = hz4Var2.e;
                m05Var2.f = hz4Var2.f;
                m05Var2.g = hz4Var2.g;
                m05Var2.h = Build.VERSION.RELEASE;
                m05Var2.i = UUID.randomUUID().toString();
                hz4 hz4Var3 = this.$config;
                m05Var2.j = hz4Var3.h;
                m05Var2.k = hz4Var3.i;
                m05Var2.l = hz4Var3.j;
                m05Var2.m = Long.valueOf(System.currentTimeMillis());
                hz4 hz4Var4 = this.$config;
                m05Var2.n = hz4Var4.k;
                m05Var2.p = hz4Var4.m;
                m05Var2.o = hz4Var4.l;
                m05Var2.q = hz4Var4.n;
                c19 c19Var = c19.b;
                Locale locale = LocaleList.getDefault().get(0);
                m05Var2.r = locale == null ? null : locale.toString();
                m05Var2.s = this.$context.getResources().getConfiguration().orientation == 1 ? bna.PORTRAIT : bna.LANDSCAPE;
                return j6g.a;
            }
        }

        public static m05 a(Context context, hz4 hz4Var, Function1 function1) {
            context.getClass();
            hz4Var.getClass();
            function1.getClass();
            C0311a c0311a = new C0311a(hz4Var, context);
            m05 m05Var = new m05();
            c0311a.invoke(m05Var);
            function1.invoke(m05Var);
            return m05Var;
        }
    }

    public final EventProperties a() {
        NullableString nullableString;
        NullableString nullableString2;
        NullableString nullableString3;
        NullableString nullableString4;
        String str;
        NullableString nullableString5;
        NullableString nullableString6;
        NullableString nullableString7;
        NullableString nullableString8;
        NullableString nullableString9;
        NullableString nullableString10;
        vk0 vk0Var = this.a;
        if (vk0Var == null) {
            r6.g("Required value was null.");
            return null;
        }
        String str2 = this.b;
        if (str2 == null) {
            r6.g("Required value was null.");
            return null;
        }
        Integer num = this.c;
        if (num == null) {
            r6.g("Required value was null.");
            return null;
        }
        int iIntValue = num.intValue();
        String str3 = this.d;
        if (str3 == null) {
            r6.g("Required value was null.");
            return null;
        }
        String str4 = this.e;
        if (str4 == null) {
            r6.g("Required value was null.");
            return null;
        }
        if (this.f == null) {
            nullableString = null;
        } else {
            String str5 = this.f;
            str5.getClass();
            nullableString = new NullableString(str5);
        }
        if (this.g == null) {
            nullableString2 = null;
        } else {
            String str6 = this.g;
            str6.getClass();
            nullableString2 = new NullableString(str6);
        }
        if (this.h == null) {
            nullableString3 = null;
        } else {
            String str7 = this.h;
            str7.getClass();
            nullableString3 = new NullableString(str7);
        }
        NullableString nullableString11 = nullableString2;
        String str8 = this.i;
        if (str8 == null) {
            r6.g("Required value was null.");
            return null;
        }
        NullableString nullableString12 = nullableString;
        NullableString nullableString13 = nullableString3;
        String str9 = this.j;
        if (str9 == null) {
            r6.g("Required value was null.");
            return null;
        }
        String str10 = this.k;
        if (str10 == null) {
            r6.g("Required value was null.");
            return null;
        }
        String str11 = this.l;
        if (str11 == null) {
            r6.g("Required value was null.");
            return null;
        }
        Long l = this.m;
        if (l == null) {
            r6.g("Required value was null.");
            return null;
        }
        long jLongValue = l.longValue();
        List<String> list = this.n;
        if (list == null) {
            r6.g("Required value was null.");
            return null;
        }
        if (this.o == null) {
            str = str2;
            nullableString4 = null;
        } else {
            str = str2;
            String str12 = this.o;
            str12.getClass();
            nullableString4 = new NullableString(str12);
        }
        if (this.p == null) {
            nullableString6 = nullableString4;
            nullableString5 = null;
        } else {
            nullableString6 = nullableString4;
            String str13 = this.p;
            str13.getClass();
            nullableString5 = new NullableString(str13);
        }
        if (this.q == null) {
            nullableString8 = nullableString5;
            nullableString7 = null;
        } else {
            nullableString8 = nullableString5;
            String str14 = this.q;
            str14.getClass();
            nullableString7 = new NullableString(str14);
        }
        if (this.r == null) {
            nullableString10 = nullableString7;
            nullableString9 = null;
        } else {
            nullableString10 = nullableString7;
            String str15 = this.r;
            str15.getClass();
            nullableString9 = new NullableString(str15);
        }
        bna bnaVar = this.s;
        if (bnaVar == null) {
            r6.g("Required value was null.");
            return null;
        }
        return new EventProperties(vk0Var, str, iIntValue, str3, str4, nullableString12, nullableString11, nullableString13, str8, str9, str10, str11, jLongValue, list, nullableString6, nullableString8, nullableString10, nullableString9, bnaVar, null);
    }
}
