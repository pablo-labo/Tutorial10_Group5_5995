package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.wlproctor.common.PayloadSpecification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class cd4 extends defpackage.k2 {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a0 implements vn1<a> {
        public static final a0 a;
        public static final /* synthetic */ a0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        a0 EF0;

        static {
            a aVar = a.A0;
            a0 a0Var = new a0("inactive", 0, aVar, -1);
            a0 a0Var2 = new a0("control", 1, aVar, 0);
            a0 a0Var3 = new a0("control_a", 2, aVar, 1);
            a0 a0Var4 = new a0(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2);
            a = a0Var4;
            b = new a0[]{a0Var, a0Var2, a0Var3, a0Var4};
        }

        public a0() {
            throw null;
        }

        public a0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static a0 valueOf(String str) {
            return (a0) Enum.valueOf(a0.class, str);
        }

        public static a0[] values() {
            return (a0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a1 implements vn1<a> {
        public static final /* synthetic */ a1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        a1 EF8;

        static {
            a aVar = a.V1;
            a = new a1[]{new a1("inactive", 0, aVar, -1), new a1("control", 1, aVar, 0), new a1("active_grp1", 2, aVar, 1), new a1("active_grp2", 3, aVar, 2), new a1("active_grp3", 4, aVar, 3)};
        }

        public a1() {
            throw null;
        }

        public a1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static a1 valueOf(String str) {
            return (a1) Enum.valueOf(a1.class, str);
        }

        public static a1[] values() {
            return (a1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a2 implements vn1<a> {
        public static final /* synthetic */ a2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        a2 EF8;

        static {
            a aVar = a.Y1;
            a = new a2[]{new a2("inactive", 0, aVar, -1), new a2("control", 1, aVar, 0), new a2("test", 2, aVar, 1)};
        }

        public a2() {
            throw null;
        }

        public a2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static a2 valueOf(String str) {
            return (a2) Enum.valueOf(a2.class, str);
        }

        public static a2[] values() {
            return (a2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a3 implements vn1<a> {
        public static final /* synthetic */ a3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        a3 EF8;

        static {
            a aVar = a.s1;
            a = new a3[]{new a3("inactive", 0, aVar, -1), new a3("control", 1, aVar, 0), new a3("test", 2, aVar, 1)};
        }

        public a3() {
            throw null;
        }

        public a3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static a3 valueOf(String str) {
            return (a3) Enum.valueOf(a3.class, str);
        }

        public static a3[] values() {
            return (a3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a4 implements vn1<a> {
        public static final a4 a;
        public static final /* synthetic */ a4[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        a4 EF0;

        static {
            a aVar = a.n2;
            a4 a4Var = new a4("inactive", 0, aVar, -1);
            a4 a4Var2 = new a4("control", 1, aVar, 0);
            a4 a4Var3 = new a4(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = a4Var3;
            b = new a4[]{a4Var, a4Var2, a4Var3};
        }

        public a4() {
            throw null;
        }

        public a4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static a4 valueOf(String str) {
            return (a4) Enum.valueOf(a4.class, str);
        }

        public static a4[] values() {
            return (a4[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a5 implements vn1<a> {
        public static final /* synthetic */ a5[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        a5 EF8;

        static {
            a aVar = a.Q1;
            a = new a5[]{new a5("inactive", 0, aVar, -1), new a5("control", 1, aVar, 0), new a5("test", 2, aVar, 1)};
        }

        public a5() {
            throw null;
        }

        public a5(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static a5 valueOf(String str) {
            return (a5) Enum.valueOf(a5.class, str);
        }

        public static a5[] values() {
            return (a5[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b implements vn1<a> {
        public static final /* synthetic */ b[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        b EF8;

        static {
            a aVar = a.g2;
            a = new b[]{new b("inactive", 0, aVar, -1), new b("control", 1, aVar, 0), new b("test", 2, aVar, 1)};
        }

        public b() {
            throw null;
        }

        public b(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b0 implements vn1<a> {
        public static final b0 a;
        public static final b0 b;
        public static final /* synthetic */ b0[] c;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        b0 EF0;

        static {
            a aVar = a.h0;
            b0 b0Var = new b0("inactive", 0, aVar, -1);
            b0 b0Var2 = new b0("control", 1, aVar, 0);
            b0 b0Var3 = new b0("control_aa", 2, aVar, 1);
            b0 b0Var4 = new b0("nudge_a", 3, aVar, 2);
            a = b0Var4;
            b0 b0Var5 = new b0("forced_a", 4, aVar, 5);
            b0 b0Var6 = new b0("block_a", 5, aVar, 8);
            b = b0Var6;
            c = new b0[]{b0Var, b0Var2, b0Var3, b0Var4, b0Var5, b0Var6, new b0("reserved_a", 6, aVar, 11), new b0("reserved_b", 7, aVar, 12)};
        }

        public b0() {
            throw null;
        }

        public b0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static b0 valueOf(String str) {
            return (b0) Enum.valueOf(b0.class, str);
        }

        public static b0[] values() {
            return (b0[]) c.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b1 implements vn1<a> {
        public static final /* synthetic */ b1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        b1 EF8;

        static {
            a aVar = a.B1;
            a = new b1[]{new b1("inactive", 0, aVar, -1), new b1("control", 1, aVar, 0), new b1("active_grp1", 2, aVar, 1), new b1("active_grp2", 3, aVar, 2), new b1("active_grp3", 4, aVar, 3)};
        }

        public b1() {
            throw null;
        }

        public b1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static b1 valueOf(String str) {
            return (b1) Enum.valueOf(b1.class, str);
        }

        public static b1[] values() {
            return (b1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b2 implements vn1<a> {
        public static final /* synthetic */ b2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        b2 EF8;

        static {
            a aVar = a.l0;
            a = new b2[]{new b2("inactive", 0, aVar, -1), new b2("control", 1, aVar, 0), new b2("phase_a_active", 2, aVar, 1), new b2("phase_b_control", 3, aVar, 2), new b2("phase_b_active", 4, aVar, 3), new b2("reserved_c", 5, aVar, 4)};
        }

        public b2() {
            throw null;
        }

        public b2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static b2 valueOf(String str) {
            return (b2) Enum.valueOf(b2.class, str);
        }

        public static b2[] values() {
            return (b2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b3 implements vn1<a> {
        public static final /* synthetic */ b3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        b3 EF8;

        static {
            a aVar = a.v2;
            a = new b3[]{new b3("inactive", 0, aVar, -1), new b3("control", 1, aVar, 0), new b3("test", 2, aVar, 1)};
        }

        public b3() {
            throw null;
        }

        public b3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static b3 valueOf(String str) {
            return (b3) Enum.valueOf(b3.class, str);
        }

        public static b3[] values() {
            return (b3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b4 implements vn1<a> {
        public static final b4 a;
        public static final /* synthetic */ b4[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        b4 EF0;

        static {
            a aVar = a.t0;
            b4 b4Var = new b4("inactive", 0, aVar, -1);
            b4 b4Var2 = new b4("control", 1, aVar, 0);
            b4 b4Var3 = new b4(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = b4Var3;
            b = new b4[]{b4Var, b4Var2, b4Var3};
        }

        public b4() {
            throw null;
        }

        public b4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static b4 valueOf(String str) {
            return (b4) Enum.valueOf(b4.class, str);
        }

        public static b4[] values() {
            return (b4[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b5 implements vn1<a> {
        public static final /* synthetic */ b5[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        b5 EF8;

        static {
            a aVar = a.G2;
            a = new b5[]{new b5("inactive", 0, aVar, -1), new b5("control", 1, aVar, 0), new b5(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public b5() {
            throw null;
        }

        public b5(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static b5 valueOf(String str) {
            return (b5) Enum.valueOf(b5.class, str);
        }

        public static b5[] values() {
            return (b5[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class c implements vn1<a> {
        public static final /* synthetic */ c[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        c EF8;

        static {
            a aVar = a.h2;
            a = new c[]{new c("inactive", 0, aVar, -1), new c("control", 1, aVar, 0), new c("test", 2, aVar, 1)};
        }

        public c() {
            throw null;
        }

        public c(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class c0 implements vn1<a> {
        public static final c0 a;
        public static final /* synthetic */ c0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        c0 EF0;

        static {
            a aVar = a.z1;
            c0 c0Var = new c0("inactive", 0, aVar, -1);
            c0 c0Var2 = new c0("control", 1, aVar, 0);
            c0 c0Var3 = new c0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = c0Var3;
            b = new c0[]{c0Var, c0Var2, c0Var3};
        }

        public c0() {
            throw null;
        }

        public c0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static c0 valueOf(String str) {
            return (c0) Enum.valueOf(c0.class, str);
        }

        public static c0[] values() {
            return (c0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class c1 implements vn1<a> {
        public static final /* synthetic */ c1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        c1 EF8;

        static {
            a aVar = a.j0;
            a = new c1[]{new c1("inactive", 0, aVar, -1), new c1("control", 1, aVar, 0), new c1(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1), new c1("active_v2", 3, aVar, 2)};
        }

        public c1() {
            throw null;
        }

        public c1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static c1 valueOf(String str) {
            return (c1) Enum.valueOf(c1.class, str);
        }

        public static c1[] values() {
            return (c1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class c2 implements vn1<a> {
        public static final /* synthetic */ c2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        c2 EF8;

        static {
            a aVar = a.H1;
            a = new c2[]{new c2("inactive", 0, aVar, -1), new c2("control", 1, aVar, 0), new c2("control_aa", 2, aVar, 1), new c2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public c2() {
            throw null;
        }

        public c2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static c2 valueOf(String str) {
            return (c2) Enum.valueOf(c2.class, str);
        }

        public static c2[] values() {
            return (c2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class c3 implements vn1<a> {
        public static final c3 a;
        public static final /* synthetic */ c3[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        c3 EF0;

        static {
            a aVar = a.I2;
            c3 c3Var = new c3("inactive", 0, aVar, -1);
            c3 c3Var2 = new c3("control", 1, aVar, 0);
            c3 c3Var3 = new c3(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = c3Var3;
            b = new c3[]{c3Var, c3Var2, c3Var3};
        }

        public c3() {
            throw null;
        }

        public c3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static c3 valueOf(String str) {
            return (c3) Enum.valueOf(c3.class, str);
        }

        public static c3[] values() {
            return (c3[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class c4 implements vn1<a> {
        public static final /* synthetic */ c4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        c4 EF8;

        static {
            a aVar = a.K1;
            a = new c4[]{new c4("inactive", 0, aVar, -1), new c4("control", 1, aVar, 0), new c4(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public c4() {
            throw null;
        }

        public c4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static c4 valueOf(String str) {
            return (c4) Enum.valueOf(c4.class, str);
        }

        public static c4[] values() {
            return (c4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class c5 implements vn1<a> {
        public static final /* synthetic */ c5[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        c5 EF8;

        static {
            a aVar = a.a1;
            a = new c5[]{new c5("inactive", 0, aVar, -1), new c5("control", 1, aVar, 0), new c5("control_aa", 2, aVar, 1), new c5(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public c5() {
            throw null;
        }

        public c5(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static c5 valueOf(String str) {
            return (c5) Enum.valueOf(c5.class, str);
        }

        public static c5[] values() {
            return (c5[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class d implements vn1<a> {
        public static final /* synthetic */ d[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        d EF8;

        static {
            a aVar = a.r2;
            a = new d[]{new d("inactive", 0, aVar, -1), new d("control", 1, aVar, 0), new d("active_ca", 2, aVar, 1), new d("active_us", 3, aVar, 2), new d("reserved_a", 4, aVar, 3), new d("reserved_b", 5, aVar, 4), new d("reserved_c", 6, aVar, 5), new d("reserved_d", 7, aVar, 6)};
        }

        public d() {
            throw null;
        }

        public d(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class d0 implements vn1<a> {
        public static final d0 a;
        public static final /* synthetic */ d0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        d0 EF0;

        static {
            a aVar = a.f;
            d0 d0Var = new d0("inactive", 0, aVar, -1);
            d0 d0Var2 = new d0("control", 1, aVar, 0);
            d0 d0Var3 = new d0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = d0Var3;
            b = new d0[]{d0Var, d0Var2, d0Var3};
        }

        public d0() {
            throw null;
        }

        public d0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static d0 valueOf(String str) {
            return (d0) Enum.valueOf(d0.class, str);
        }

        public static d0[] values() {
            return (d0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class d1 implements vn1<a> {
        public static final /* synthetic */ d1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        d1 EF8;

        static {
            a aVar = a.e1;
            a = new d1[]{new d1("inactive", 0, aVar, -1), new d1("control", 1, aVar, 0), new d1(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public d1() {
            throw null;
        }

        public d1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static d1 valueOf(String str) {
            return (d1) Enum.valueOf(d1.class, str);
        }

        public static d1[] values() {
            return (d1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class d2 implements vn1<a> {
        public static final /* synthetic */ d2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        d2 EF8;

        static {
            a aVar = a.D1;
            a = new d2[]{new d2("inactive", 0, aVar, -1), new d2("control", 1, aVar, 0), new d2("control_aa", 2, aVar, 1), new d2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public d2() {
            throw null;
        }

        public d2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static d2 valueOf(String str) {
            return (d2) Enum.valueOf(d2.class, str);
        }

        public static d2[] values() {
            return (d2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class d3 implements vn1<a> {
        public static final d3 a;
        public static final /* synthetic */ d3[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        d3 EF0;

        static {
            a aVar = a.R0;
            d3 d3Var = new d3("inactive", 0, aVar, -1);
            d3 d3Var2 = new d3("control", 1, aVar, 0);
            d3 d3Var3 = new d3(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = d3Var3;
            b = new d3[]{d3Var, d3Var2, d3Var3};
        }

        public d3() {
            throw null;
        }

        public d3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static d3 valueOf(String str) {
            return (d3) Enum.valueOf(d3.class, str);
        }

        public static d3[] values() {
            return (d3[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class d4 implements vn1<a> {
        public static final /* synthetic */ d4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        d4 EF8;

        static {
            a aVar = a.L1;
            a = new d4[]{new d4("inactive", 0, aVar, -1), new d4("control", 1, aVar, 0), new d4("test", 2, aVar, 1)};
        }

        public d4() {
            throw null;
        }

        public d4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static d4 valueOf(String str) {
            return (d4) Enum.valueOf(d4.class, str);
        }

        public static d4[] values() {
            return (d4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class d5 implements vn1<a> {
        public static final /* synthetic */ d5[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        d5 EF8;

        static {
            a aVar = a.m0;
            a = new d5[]{new d5("inactive", 0, aVar, -1), new d5("control", 1, aVar, 0), new d5("active_grp1", 2, aVar, 1), new d5("active_grp2", 3, aVar, 2), new d5("phase_b_control", 4, aVar, 3), new d5("phase_b_active", 5, aVar, 4), new d5("phase_b_debug", 6, aVar, 5)};
        }

        public d5() {
            throw null;
        }

        public d5(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static d5 valueOf(String str) {
            return (d5) Enum.valueOf(d5.class, str);
        }

        public static d5[] values() {
            return (d5[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class e implements vn1<a> {
        public static final /* synthetic */ e[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        e EF8;

        static {
            a aVar = a.s2;
            a = new e[]{new e("inactive", 0, aVar, -1), new e("control", 1, aVar, 0), new e("active_ca", 2, aVar, 1), new e("active_us", 3, aVar, 2), new e("reserved_a", 4, aVar, 3), new e("reserved_b", 5, aVar, 4), new e("reserved_c", 6, aVar, 5), new e("reserved_d", 7, aVar, 6)};
        }

        public e() {
            throw null;
        }

        public e(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class e0 implements vn1<a> {
        public static final e0 a;
        public static final /* synthetic */ e0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        e0 EF0;

        static {
            a aVar = a.V;
            e0 e0Var = new e0("inactive", 0, aVar, -1);
            e0 e0Var2 = new e0("control", 1, aVar, 0);
            e0 e0Var3 = new e0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = e0Var3;
            b = new e0[]{e0Var, e0Var2, e0Var3};
        }

        public e0() {
            throw null;
        }

        public e0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static e0 valueOf(String str) {
            return (e0) Enum.valueOf(e0.class, str);
        }

        public static e0[] values() {
            return (e0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class e1 implements vn1<a> {
        public static final /* synthetic */ e1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        e1 EF8;

        static {
            a aVar = a.W1;
            a = new e1[]{new e1("inactive", 0, aVar, -1), new e1("control", 1, aVar, 0), new e1(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1), new e1("active_grp2", 3, aVar, 2), new e1("active_grp3", 4, aVar, 3), new e1("active_grp4", 5, aVar, 4), new e1("active_grp5", 6, aVar, 5)};
        }

        public e1() {
            throw null;
        }

        public e1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static e1 valueOf(String str) {
            return (e1) Enum.valueOf(e1.class, str);
        }

        public static e1[] values() {
            return (e1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class e2 implements vn1<a> {
        public static final /* synthetic */ e2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        e2 EF8;

        static {
            a aVar = a.J1;
            a = new e2[]{new e2("inactive", 0, aVar, -1), new e2("control", 1, aVar, 0), new e2("control_aa", 2, aVar, 1), new e2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public e2() {
            throw null;
        }

        public e2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static e2 valueOf(String str) {
            return (e2) Enum.valueOf(e2.class, str);
        }

        public static e2[] values() {
            return (e2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class e3 implements vn1<a> {
        public static final e3 a;
        public static final /* synthetic */ e3[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        e3 EF0;

        static {
            a aVar = a.b;
            e3 e3Var = new e3("inactive", 0, aVar, -1);
            e3 e3Var2 = new e3("control", 1, aVar, 0);
            e3 e3Var3 = new e3(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = e3Var3;
            b = new e3[]{e3Var, e3Var2, e3Var3};
        }

        public e3() {
            throw null;
        }

        public e3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static e3 valueOf(String str) {
            return (e3) Enum.valueOf(e3.class, str);
        }

        public static e3[] values() {
            return (e3[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class e4 implements vn1<a> {
        public static final e4 a;
        public static final /* synthetic */ e4[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        e4 EF0;

        static {
            a aVar = a.E2;
            e4 e4Var = new e4("inactive", 0, aVar, -1);
            e4 e4Var2 = new e4("control", 1, aVar, 0);
            e4 e4Var3 = new e4(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = e4Var3;
            b = new e4[]{e4Var, e4Var2, e4Var3};
        }

        public e4() {
            throw null;
        }

        public e4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static e4 valueOf(String str) {
            return (e4) Enum.valueOf(e4.class, str);
        }

        public static e4[] values() {
            return (e4[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class e5 implements vn1<a> {
        public static final /* synthetic */ e5[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        e5 EF8;

        static {
            a aVar = a.j1;
            a = new e5[]{new e5("inactive", 0, aVar, -1), new e5("control", 1, aVar, 0), new e5("test", 2, aVar, 1)};
        }

        public e5() {
            throw null;
        }

        public e5(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static e5 valueOf(String str) {
            return (e5) Enum.valueOf(e5.class, str);
        }

        public static e5[] values() {
            return (e5[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class f implements vn1<a> {
        public static final /* synthetic */ f[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        f EF8;

        static {
            a aVar = a.o1;
            a = new f[]{new f("inactive", 0, aVar, -1), new f("control", 1, aVar, 0), new f(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public f() {
            throw null;
        }

        public f(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class f0 implements vn1<a> {
        public static final /* synthetic */ f0[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        f0 EF8;

        static {
            a aVar = a.A2;
            a = new f0[]{new f0("inactive", 0, aVar, -1), new f0(AppStateModule.APP_STATE_ACTIVE, 1, aVar, 1)};
        }

        public f0() {
            throw null;
        }

        public f0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static f0 valueOf(String str) {
            return (f0) Enum.valueOf(f0.class, str);
        }

        public static f0[] values() {
            return (f0[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class f1 implements vn1<a> {
        public static final /* synthetic */ f1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        f1 EF8;

        static {
            a aVar = a.G0;
            a = new f1[]{new f1("inactive", 0, aVar, -1), new f1("control", 1, aVar, 0), new f1("control_aa", 2, aVar, 1), new f1(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2), new f1("reserved", 4, aVar, 3)};
        }

        public f1() {
            throw null;
        }

        public f1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static f1 valueOf(String str) {
            return (f1) Enum.valueOf(f1.class, str);
        }

        public static f1[] values() {
            return (f1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class f2 implements vn1<a> {
        public static final /* synthetic */ f2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        f2 EF8;

        static {
            a aVar = a.F2;
            a = new f2[]{new f2("inactive", 0, aVar, -1), new f2("control", 1, aVar, 0), new f2("control_aa", 2, aVar, 1), new f2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public f2() {
            throw null;
        }

        public f2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static f2 valueOf(String str) {
            return (f2) Enum.valueOf(f2.class, str);
        }

        public static f2[] values() {
            return (f2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class f3 implements vn1<a> {
        public static final /* synthetic */ f3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        f3 EF8;

        static {
            a aVar = a.f2;
            a = new f3[]{new f3("inactive", 0, aVar, -1), new f3("control", 1, aVar, 0), new f3(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public f3() {
            throw null;
        }

        public f3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static f3 valueOf(String str) {
            return (f3) Enum.valueOf(f3.class, str);
        }

        public static f3[] values() {
            return (f3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class f4 implements vn1<a> {
        public static final /* synthetic */ f4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        f4 EF8;

        static {
            a aVar = a.m2;
            a = new f4[]{new f4("inactive", 0, aVar, -1), new f4("control", 1, aVar, 0), new f4("test", 2, aVar, 1)};
        }

        public f4() {
            throw null;
        }

        public f4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static f4 valueOf(String str) {
            return (f4) Enum.valueOf(f4.class, str);
        }

        public static f4[] values() {
            return (f4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class f5 implements vn1<a> {
        public static final /* synthetic */ f5[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        f5 EF8;

        static {
            a aVar = a.m1;
            a = new f5[]{new f5("inactive", 0, aVar, -1), new f5("control", 1, aVar, 0), new f5("control_aa", 2, aVar, 1), new f5(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public f5() {
            throw null;
        }

        public f5(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static f5 valueOf(String str) {
            return (f5) Enum.valueOf(f5.class, str);
        }

        public static f5[] values() {
            return (f5[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class g implements vn1<a> {
        public static final /* synthetic */ g[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        g EF8;

        static {
            a aVar = a.t2;
            a = new g[]{new g("inactive", 0, aVar, -1), new g("control", 1, aVar, 0), new g("test", 2, aVar, 1), new g("reserved_a", 3, aVar, 2), new g("reserved_b", 4, aVar, 3), new g("reserved_c", 5, aVar, 4), new g("reserved_d", 6, aVar, 5)};
        }

        public g() {
            throw null;
        }

        public g(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class g0 implements vn1<a> {
        public static final /* synthetic */ g0[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        g0 EF8;

        static {
            a aVar = a.R1;
            a = new g0[]{new g0("inactive", 0, aVar, -1), new g0("control", 1, aVar, 0), new g0("active_grp1", 2, aVar, 1), new g0("active_grp2", 3, aVar, 2), new g0("active_grp3", 4, aVar, 3)};
        }

        public g0() {
            throw null;
        }

        public g0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static g0 valueOf(String str) {
            return (g0) Enum.valueOf(g0.class, str);
        }

        public static g0[] values() {
            return (g0[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class g1 implements vn1<a> {
        public static final /* synthetic */ g1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        g1 EF8;

        static {
            a aVar = a.t1;
            a = new g1[]{new g1("inactive", 0, aVar, -1), new g1("control", 1, aVar, 0), new g1("active_grp1", 2, aVar, 1), new g1("active_grp2", 3, aVar, 2), new g1("active_grp3", 4, aVar, 3), new g1("active_grp4", 5, aVar, 4), new g1("active_grp5", 6, aVar, 5), new g1("active_grp6", 7, aVar, 6)};
        }

        public g1() {
            throw null;
        }

        public g1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static g1 valueOf(String str) {
            return (g1) Enum.valueOf(g1.class, str);
        }

        public static g1[] values() {
            return (g1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class g2 implements vn1<a> {
        public static final /* synthetic */ g2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        g2 EF8;

        static {
            a aVar = a.T2;
            a = new g2[]{new g2("inactive", 0, aVar, -1), new g2("control", 1, aVar, 0), new g2("control_aa", 2, aVar, 1), new g2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public g2() {
            throw null;
        }

        public g2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static g2 valueOf(String str) {
            return (g2) Enum.valueOf(g2.class, str);
        }

        public static g2[] values() {
            return (g2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class g3 implements vn1<a> {
        public static final /* synthetic */ g3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        g3 EF8;

        static {
            a aVar = a.X;
            a = new g3[]{new g3("inactive", 0, aVar, -1), new g3("control", 1, aVar, 0), new g3("first", 2, aVar, 1), new g3("second", 3, aVar, 2), new g3("third", 4, aVar, 3), new g3("fourth", 5, aVar, 4), new g3("fifth", 6, aVar, 5), new g3("sixth", 7, aVar, 6), new g3("seventh", 8, aVar, 7), new g3("eighth", 9, aVar, 8), new g3("ninth", 10, aVar, 9)};
        }

        public g3() {
            throw null;
        }

        public g3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static g3 valueOf(String str) {
            return (g3) Enum.valueOf(g3.class, str);
        }

        public static g3[] values() {
            return (g3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class g4 implements vn1<a> {
        public static final /* synthetic */ g4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        g4 EF8;

        static {
            a aVar = a.x2;
            a = new g4[]{new g4("inactive", 0, aVar, -1), new g4("control", 1, aVar, 0), new g4("test", 2, aVar, 1)};
        }

        public g4() {
            throw null;
        }

        public g4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static g4 valueOf(String str) {
            return (g4) Enum.valueOf(g4.class, str);
        }

        public static g4[] values() {
            return (g4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class g5 implements vn1<a> {
        public static final /* synthetic */ g5[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        g5 EF8;

        static {
            a aVar = a.i1;
            a = new g5[]{new g5("inactive", 0, aVar, -1), new g5("web_allocation", 1, aVar, 0), new g5("control", 2, aVar, 1), new g5("control_aa", 3, aVar, 2), new g5(AppStateModule.APP_STATE_ACTIVE, 4, aVar, 3), new g5("reserve_a", 5, aVar, 4), new g5("reserve_b", 6, aVar, 5), new g5("reserve_c", 7, aVar, 6), new g5("reserve_d", 8, aVar, 7), new g5("reserve_e", 9, aVar, 8), new g5("reserve_f", 10, aVar, 9), new g5("reserve_g", 11, aVar, 10)};
        }

        public g5() {
            throw null;
        }

        public g5(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static g5 valueOf(String str) {
            return (g5) Enum.valueOf(g5.class, str);
        }

        public static g5[] values() {
            return (g5[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class h implements vn1<a> {
        public static final /* synthetic */ h[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        h EF8;

        static {
            a aVar = a.A1;
            a = new h[]{new h("inactive", 0, aVar, -1), new h("control", 1, aVar, 0), new h(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public h() {
            throw null;
        }

        public h(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class h0 implements vn1<a> {
        public static final /* synthetic */ h0[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        h0 EF8;

        static {
            a aVar = a.d;
            a = new h0[]{new h0("inactive", 0, aVar, -1), new h0("control", 1, aVar, 0), new h0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public h0() {
            throw null;
        }

        public h0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static h0 valueOf(String str) {
            return (h0) Enum.valueOf(h0.class, str);
        }

        public static h0[] values() {
            return (h0[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class h1 implements vn1<a> {
        public static final /* synthetic */ h1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        h1 EF8;

        static {
            a aVar = a.S0;
            a = new h1[]{new h1("inactive", 0, aVar, -1), new h1("control", 1, aVar, 0), new h1(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public h1() {
            throw null;
        }

        public h1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static h1 valueOf(String str) {
            return (h1) Enum.valueOf(h1.class, str);
        }

        public static h1[] values() {
            return (h1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class h2 implements vn1<a> {
        public static final /* synthetic */ h2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        h2 EF8;

        static {
            a aVar = a.I1;
            a = new h2[]{new h2("inactive", 0, aVar, -1), new h2("control", 1, aVar, 0), new h2("control_aa", 2, aVar, 1), new h2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public h2() {
            throw null;
        }

        public h2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static h2 valueOf(String str) {
            return (h2) Enum.valueOf(h2.class, str);
        }

        public static h2[] values() {
            return (h2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class h3 implements vn1<a> {
        public static final /* synthetic */ h3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        h3 EF8;

        static {
            a aVar = a.W;
            a = new h3[]{new h3("inactive", 0, aVar, -1), new h3("control", 1, aVar, 0), new h3("holdout", 2, aVar, 1), new h3("active_crowtaxo", 3, aVar, 2)};
        }

        public h3() {
            throw null;
        }

        public h3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static h3 valueOf(String str) {
            return (h3) Enum.valueOf(h3.class, str);
        }

        public static h3[] values() {
            return (h3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class h4 implements vn1<a> {
        public static final /* synthetic */ h4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        h4 EF8;

        static {
            a aVar = a.y2;
            a = new h4[]{new h4("inactive", 0, aVar, -1), new h4("control", 1, aVar, 0), new h4("control_aa", 2, aVar, 1), new h4("tst", 3, aVar, 2)};
        }

        public h4() {
            throw null;
        }

        public h4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static h4 valueOf(String str) {
            return (h4) Enum.valueOf(h4.class, str);
        }

        public static h4[] values() {
            return (h4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class h5 implements vn1<a> {
        public static final /* synthetic */ h5[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        h5 EF8;

        static {
            a aVar = a.k1;
            a = new h5[]{new h5("inactive", 0, aVar, -1), new h5("control", 1, aVar, 0), new h5("control_aa", 2, aVar, 1), new h5("grp2", 3, aVar, 2), new h5("grp3", 4, aVar, 3), new h5("grp4", 5, aVar, 4), new h5("grp5", 6, aVar, 5)};
        }

        public h5() {
            throw null;
        }

        public h5(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static h5 valueOf(String str) {
            return (h5) Enum.valueOf(h5.class, str);
        }

        public static h5[] values() {
            return (h5[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class i implements vn1<a> {
        public static final /* synthetic */ i[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        i EF8;

        static {
            a aVar = a.C2;
            a = new i[]{new i("inactive", 0, aVar, -1), new i("control", 1, aVar, 0), new i("control_aa", 2, aVar, 1), new i("phase_a_active", 3, aVar, 2), new i("phase_b_control", 4, aVar, 3), new i("phase_b_active", 5, aVar, 4), new i("phase_c_control", 6, aVar, 5), new i("phase_c_active", 7, aVar, 6), new i("reserved_f", 8, aVar, 7), new i("reserved_g", 9, aVar, 8)};
        }

        public i() {
            throw null;
        }

        public i(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class i0 implements vn1<a> {
        public static final /* synthetic */ i0[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        i0 EF8;

        static {
            a aVar = a.c;
            a = new i0[]{new i0("inactive", 0, aVar, -1), new i0("control", 1, aVar, 0), new i0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public i0() {
            throw null;
        }

        public i0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static i0 valueOf(String str) {
            return (i0) Enum.valueOf(i0.class, str);
        }

        public static i0[] values() {
            return (i0[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class i1 implements vn1<a> {
        public static final /* synthetic */ i1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        i1 EF8;

        static {
            a aVar = a.k0;
            a = new i1[]{new i1("inactive", 0, aVar, -1), new i1("control", 1, aVar, 0), new i1("active_grp1", 2, aVar, 1), new i1("active_grp2", 3, aVar, 2), new i1("active_grp3", 4, aVar, 3)};
        }

        public i1() {
            throw null;
        }

        public i1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static i1 valueOf(String str) {
            return (i1) Enum.valueOf(i1.class, str);
        }

        public static i1[] values() {
            return (i1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class i2 implements vn1<a> {
        public static final /* synthetic */ i2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        i2 EF8;

        static {
            a aVar = a.H2;
            a = new i2[]{new i2("inactive", 0, aVar, -1), new i2("control", 1, aVar, 0), new i2("control_aa", 2, aVar, 1), new i2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public i2() {
            throw null;
        }

        public i2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static i2 valueOf(String str) {
            return (i2) Enum.valueOf(i2.class, str);
        }

        public static i2[] values() {
            return (i2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class i3 implements vn1<a> {
        public static final i3 a;
        public static final /* synthetic */ i3[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        i3 EF0;

        static {
            a aVar = a.D0;
            i3 i3Var = new i3("inactive", 0, aVar, -1);
            i3 i3Var2 = new i3("control", 1, aVar, 0);
            i3 i3Var3 = new i3(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            i3 i3Var4 = new i3("dark_mode_beta", 3, aVar, 2);
            a = i3Var4;
            b = new i3[]{i3Var, i3Var2, i3Var3, i3Var4};
        }

        public i3() {
            throw null;
        }

        public i3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static i3 valueOf(String str) {
            return (i3) Enum.valueOf(i3.class, str);
        }

        public static i3[] values() {
            return (i3[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class i4 implements vn1<a> {
        public static final /* synthetic */ i4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        i4 EF8;

        static {
            a aVar = a.z2;
            a = new i4[]{new i4("inactive", 0, aVar, -1), new i4("control", 1, aVar, 0), new i4("control_aa", 2, aVar, 1), new i4("tst", 3, aVar, 2)};
        }

        public i4() {
            throw null;
        }

        public i4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static i4 valueOf(String str) {
            return (i4) Enum.valueOf(i4.class, str);
        }

        public static i4[] values() {
            return (i4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class i5 implements vn1<a> {
        public static final /* synthetic */ i5[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        i5 EF8;

        static {
            a aVar = a.N0;
            a = new i5[]{new i5("inactive", 0, aVar, -1), new i5("control", 1, aVar, 0), new i5("phase_a_active", 2, aVar, 1), new i5("phase_b_only_match_subdomains_control", 3, aVar, 2), new i5("phase_b_only_match_subdomains", 4, aVar, 3), new i5("phase_b_only_tab_back_stack_control", 5, aVar, 4), new i5("phase_b_only_tab_back_stack", 6, aVar, 5), new i5("phase_b_inline_overlay_control", 7, aVar, 6), new i5("phase_b_inline_overlay", 8, aVar, 7), new i5("phase_b_control", 9, aVar, 8), new i5("phase_b_active", 10, aVar, 9), new i5("phase_c_hide_badge_names_control", 11, aVar, 10), new i5("phase_c_hide_badge_names", 12, aVar, 11), new i5("phase_c_control", 13, aVar, 12), new i5("phase_c_active", 14, aVar, 13), new i5("phase_c_hamburger", 15, aVar, 14), new i5("phase_c_hamburger_control", 16, aVar, 15), new i5("phase_c_scroll_up", 17, aVar, 16), new i5("phase_c_scroll_up_control", 18, aVar, 17), new i5("phase_c_hide_top_nav", 19, aVar, 18), new i5("phase_c_hide_both_nav", 20, aVar, 19), new i5("phase_c_hide_nav_control", 21, aVar, 20), new i5("tare_nav_api_active", 22, aVar, 21), new i5("tare_nav_api_control", 23, aVar, 22)};
        }

        public i5() {
            throw null;
        }

        public i5(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static i5 valueOf(String str) {
            return (i5) Enum.valueOf(i5.class, str);
        }

        public static i5[] values() {
            return (i5[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class j implements vn1<a> {
        public static final /* synthetic */ j[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        j EF8;

        static {
            a aVar = a.I0;
            a = new j[]{new j("max_nav_allocation_droid", 0, aVar, 1), new j("stable_app_allocation_droid", 1, aVar, 2), new j("shared_experimental_allocation_droid", 2, aVar, 3), new j("companion_allocation_droid", 3, aVar, 4)};
        }

        public j() {
            throw null;
        }

        public j(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class j0 implements vn1<a> {
        public static final /* synthetic */ j0[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        j0 EF8;

        static {
            a aVar = a.o2;
            a = new j0[]{new j0("inactive", 0, aVar, -1), new j0("control", 1, aVar, 0), new j0("control_aa", 2, aVar, 1), new j0(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public j0() {
            throw null;
        }

        public j0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static j0 valueOf(String str) {
            return (j0) Enum.valueOf(j0.class, str);
        }

        public static j0[] values() {
            return (j0[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class j1 implements vn1<a> {
        public static final /* synthetic */ j1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        j1 EF8;

        static {
            a aVar = a.C0;
            a = new j1[]{new j1("inactive", 0, aVar, -1), new j1("control", 1, aVar, 0), new j1("grp1", 2, aVar, 1)};
        }

        public j1() {
            throw null;
        }

        public j1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static j1 valueOf(String str) {
            return (j1) Enum.valueOf(j1.class, str);
        }

        public static j1[] values() {
            return (j1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class j2 implements vn1<a> {
        public static final /* synthetic */ j2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        j2 EF8;

        static {
            a aVar = a.G1;
            a = new j2[]{new j2("inactive", 0, aVar, -1), new j2("control", 1, aVar, 0), new j2("control_aa", 2, aVar, 1), new j2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public j2() {
            throw null;
        }

        public j2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static j2 valueOf(String str) {
            return (j2) Enum.valueOf(j2.class, str);
        }

        public static j2[] values() {
            return (j2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class j3 implements vn1<a> {
        public static final /* synthetic */ j3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        j3 EF8;

        static {
            a aVar = a.c2;
            a = new j3[]{new j3("inactive", 0, aVar, -1), new j3("control", 1, aVar, 0), new j3(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public j3() {
            throw null;
        }

        public j3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static j3 valueOf(String str) {
            return (j3) Enum.valueOf(j3.class, str);
        }

        public static j3[] values() {
            return (j3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class j4 implements vn1<a> {
        public static final /* synthetic */ j4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        j4 EF8;

        static {
            a aVar = a.J2;
            a = new j4[]{new j4("inactive", 0, aVar, -1), new j4("control", 1, aVar, 0), new j4("control_aa", 2, aVar, 1), new j4("tst", 3, aVar, 2)};
        }

        public j4() {
            throw null;
        }

        public j4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static j4 valueOf(String str) {
            return (j4) Enum.valueOf(j4.class, str);
        }

        public static j4[] values() {
            return (j4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class j5 implements vn1<a> {
        public static final /* synthetic */ j5[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        j5 EF8;

        static {
            a aVar = a.O0;
            a = new j5[]{new j5("inactive", 0, aVar, -1), new j5("control", 1, aVar, 0), new j5("ian_base_config", 2, aVar, 1), new j5("depricated", 3, aVar, 2), new j5("depricated_control", 4, aVar, 3), new j5("ace_fifth_tab", 5, aVar, 4), new j5("ace_fifth_tab_control", 6, aVar, 5), new j5("search_fifth_tab", 7, aVar, 6), new j5("search_fifth_tab_control", 8, aVar, 7)};
        }

        public j5() {
            throw null;
        }

        public j5(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static j5 valueOf(String str) {
            return (j5) Enum.valueOf(j5.class, str);
        }

        public static j5[] values() {
            return (j5[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class k implements vn1<a> {
        public static final /* synthetic */ k[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        k EF8;

        static {
            a aVar = a.i2;
            a = new k[]{new k("inactive", 0, aVar, -1), new k("control", 1, aVar, 0), new k("matchSection", 2, aVar, 1), new k("separate", 3, aVar, 2), new k("scroll", 4, aVar, 3), new k("ask", 5, aVar, 4)};
        }

        public k() {
            throw null;
        }

        public k(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static k valueOf(String str) {
            return (k) Enum.valueOf(k.class, str);
        }

        public static k[] values() {
            return (k[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class k0 implements vn1<a> {
        public static final k0 a;
        public static final /* synthetic */ k0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        k0 EF0;

        static {
            a aVar = a.u0;
            k0 k0Var = new k0("inactive", 0, aVar, -1);
            k0 k0Var2 = new k0("control", 1, aVar, 0);
            k0 k0Var3 = new k0("control_aa", 2, aVar, 1);
            k0 k0Var4 = new k0(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2);
            a = k0Var4;
            b = new k0[]{k0Var, k0Var2, k0Var3, k0Var4};
        }

        public k0() {
            throw null;
        }

        public k0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static k0 valueOf(String str) {
            return (k0) Enum.valueOf(k0.class, str);
        }

        public static k0[] values() {
            return (k0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class k1 implements vn1<a> {
        public static final /* synthetic */ k1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        k1 EF8;

        static {
            a aVar = a.v1;
            a = new k1[]{new k1("inactive", 0, aVar, -1), new k1("control", 1, aVar, 0), new k1("active_grp1", 2, aVar, 1), new k1("active_grp2", 3, aVar, 2)};
        }

        public k1() {
            throw null;
        }

        public k1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static k1 valueOf(String str) {
            return (k1) Enum.valueOf(k1.class, str);
        }

        public static k1[] values() {
            return (k1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class k2 implements vn1<a> {
        public static final /* synthetic */ k2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        k2 EF8;

        static {
            a aVar = a.F1;
            a = new k2[]{new k2("inactive", 0, aVar, -1), new k2("control", 1, aVar, 0), new k2("control_aa", 2, aVar, 1), new k2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public k2() {
            throw null;
        }

        public k2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static k2 valueOf(String str) {
            return (k2) Enum.valueOf(k2.class, str);
        }

        public static k2[] values() {
            return (k2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class k3 implements vn1<a> {
        public static final /* synthetic */ k3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        k3 EF8;

        static {
            a aVar = a.b0;
            a = new k3[]{new k3("inactive", 0, aVar, -1), new k3("control", 1, aVar, 0), new k3(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public k3() {
            throw null;
        }

        public k3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static k3 valueOf(String str) {
            return (k3) Enum.valueOf(k3.class, str);
        }

        public static k3[] values() {
            return (k3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class k4 implements vn1<a> {
        public static final /* synthetic */ k4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        k4 EF8;

        static {
            a aVar = a.K2;
            a = new k4[]{new k4("inactive", 0, aVar, -1), new k4("control", 1, aVar, 0), new k4("control_aa", 2, aVar, 1), new k4("tst", 3, aVar, 2)};
        }

        public k4() {
            throw null;
        }

        public k4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static k4 valueOf(String str) {
            return (k4) Enum.valueOf(k4.class, str);
        }

        public static k4[] values() {
            return (k4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class k5 implements vn1<a> {
        public static final /* synthetic */ k5[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        k5 EF8;

        static {
            a aVar = a.L0;
            a = new k5[]{new k5("inactive", 0, aVar, -1), new k5("control", 1, aVar, 0), new k5("phase_a_active", 2, aVar, 1), new k5("phase_b_only_match_subdomains_control", 3, aVar, 2), new k5("phase_b_only_match_subdomains", 4, aVar, 3), new k5("phase_b_only_tab_back_stack_control", 5, aVar, 4), new k5("phase_b_only_tab_back_stack", 6, aVar, 5), new k5("phase_b_inline_overlay_control", 7, aVar, 6), new k5("phase_b_inline_overlay", 8, aVar, 7), new k5("phase_b_control", 9, aVar, 8), new k5("phase_b_active", 10, aVar, 9), new k5("phase_c_hide_badge_names_control", 11, aVar, 10), new k5("phase_c_hide_badge_names", 12, aVar, 11), new k5("phase_c_control", 13, aVar, 12), new k5("phase_c_active", 14, aVar, 13), new k5("phase_c_hamburger", 15, aVar, 14), new k5("phase_c_hamburger_control", 16, aVar, 15), new k5("phase_c_scroll_up", 17, aVar, 16), new k5("phase_c_scroll_up_control", 18, aVar, 17), new k5("phase_c_hide_top_nav", 19, aVar, 18), new k5("phase_c_hide_both_nav", 20, aVar, 19), new k5("phase_c_hide_nav_control", 21, aVar, 20), new k5("tare_nav_api_active", 22, aVar, 21), new k5("tare_nav_api_control", 23, aVar, 22)};
        }

        public k5() {
            throw null;
        }

        public k5(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static k5 valueOf(String str) {
            return (k5) Enum.valueOf(k5.class, str);
        }

        public static k5[] values() {
            return (k5[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class l implements vn1<a> {
        public static final /* synthetic */ l[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        l EF8;

        static {
            a aVar = a.e2;
            a = new l[]{new l("inactive", 0, aVar, -1), new l("control", 1, aVar, 0), new l(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public l() {
            throw null;
        }

        public l(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static l valueOf(String str) {
            return (l) Enum.valueOf(l.class, str);
        }

        public static l[] values() {
            return (l[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class l0 implements vn1<a> {
        public static final l0 a;
        public static final /* synthetic */ l0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        l0 EF0;

        static {
            a aVar = a.C1;
            l0 l0Var = new l0("inactive", 0, aVar, -1);
            l0 l0Var2 = new l0("control", 1, aVar, 0);
            l0 l0Var3 = new l0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = l0Var3;
            b = new l0[]{l0Var, l0Var2, l0Var3};
        }

        public l0() {
            throw null;
        }

        public l0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static l0 valueOf(String str) {
            return (l0) Enum.valueOf(l0.class, str);
        }

        public static l0[] values() {
            return (l0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class l1 implements vn1<a> {
        public static final /* synthetic */ l1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        l1 EF8;

        static {
            a aVar = a.v0;
            a = new l1[]{new l1("inactive", 0, aVar, -1), new l1("control", 1, aVar, 0), new l1(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public l1() {
            throw null;
        }

        public l1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static l1 valueOf(String str) {
            return (l1) Enum.valueOf(l1.class, str);
        }

        public static l1[] values() {
            return (l1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class l2 implements vn1<a> {
        public static final /* synthetic */ l2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        l2 EF8;

        static {
            a aVar = a.E1;
            a = new l2[]{new l2("inactive", 0, aVar, -1), new l2("control", 1, aVar, 0), new l2("control_aa", 2, aVar, 1), new l2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public l2() {
            throw null;
        }

        public l2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static l2 valueOf(String str) {
            return (l2) Enum.valueOf(l2.class, str);
        }

        public static l2[] values() {
            return (l2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class l3 implements vn1<a> {
        public static final /* synthetic */ l3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        l3 EF8;

        static {
            a aVar = a.c0;
            a = new l3[]{new l3("inactive", 0, aVar, -1), new l3("control", 1, aVar, 0), new l3("limitQuestions", 2, aVar, 1), new l3("limitQuestionsA", 3, aVar, 2), new l3("limitQuestionsB", 4, aVar, 3), new l3("limitQuestionsC", 5, aVar, 4), new l3("limitQuestionsD", 6, aVar, 5)};
        }

        public l3() {
            throw null;
        }

        public l3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static l3 valueOf(String str) {
            return (l3) Enum.valueOf(l3.class, str);
        }

        public static l3[] values() {
            return (l3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class l4 implements vn1<a> {
        public static final /* synthetic */ l4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        l4 EF8;

        static {
            a aVar = a.L2;
            a = new l4[]{new l4("inactive", 0, aVar, -1), new l4("control", 1, aVar, 0), new l4("control_aa", 2, aVar, 1), new l4("tst", 3, aVar, 2)};
        }

        public l4() {
            throw null;
        }

        public l4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static l4 valueOf(String str) {
            return (l4) Enum.valueOf(l4.class, str);
        }

        public static l4[] values() {
            return (l4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class l5 implements vn1<a> {
        public static final l5 a;
        public static final l5 b;
        public static final l5 c;
        public static final l5 d;
        public static final /* synthetic */ l5[] e;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        l5 EF0;

        static {
            a aVar = a.M0;
            l5 l5Var = new l5("inactive", 0, aVar, -1);
            l5 l5Var2 = new l5("control", 1, aVar, 0);
            l5 l5Var3 = new l5("ian_base_config", 2, aVar, 1);
            l5 l5Var4 = new l5("depricated", 3, aVar, 2);
            l5 l5Var5 = new l5("depricated_control", 4, aVar, 3);
            l5 l5Var6 = new l5("ace_fifth_tab", 5, aVar, 4);
            l5 l5Var7 = new l5("ace_fifth_tab_control", 6, aVar, 5);
            l5 l5Var8 = new l5("japan_control", 7, aVar, 6);
            l5 l5Var9 = new l5("japan_remove_spa", 8, aVar, 7);
            a = l5Var9;
            l5 l5Var10 = new l5("japan_native_bottom_nav", 9, aVar, 8);
            b = l5Var10;
            l5 l5Var11 = new l5("japan_msg_tab_control", 10, aVar, 9);
            c = l5Var11;
            l5 l5Var12 = new l5("japan_msg_tab_active", 11, aVar, 10);
            d = l5Var12;
            e = new l5[]{l5Var, l5Var2, l5Var3, l5Var4, l5Var5, l5Var6, l5Var7, l5Var8, l5Var9, l5Var10, l5Var11, l5Var12, new l5("search_fifth_tab", 12, aVar, 11), new l5("search_fifth_tab_control", 13, aVar, 12)};
        }

        public l5() {
            throw null;
        }

        public l5(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static l5 valueOf(String str) {
            return (l5) Enum.valueOf(l5.class, str);
        }

        public static l5[] values() {
            return (l5[]) e.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class m implements vn1<a> {
        public static final /* synthetic */ m[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        m EF8;

        static {
            a aVar = a.a;
            a = new m[]{new m("inactive", 0, aVar, -1), new m("control", 1, aVar, 0), new m(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1), new m("aurora", 3, aVar, 2)};
        }

        public m() {
            throw null;
        }

        public m(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static m valueOf(String str) {
            return (m) Enum.valueOf(m.class, str);
        }

        public static m[] values() {
            return (m[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class m0 implements vn1<a> {
        public static final m0 a;
        public static final /* synthetic */ m0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        m0 EF0;

        static {
            a aVar = a.x0;
            m0 m0Var = new m0("inactive", 0, aVar, -1);
            m0 m0Var2 = new m0("control", 1, aVar, 0);
            m0 m0Var3 = new m0("control_aa", 2, aVar, 1);
            m0 m0Var4 = new m0(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2);
            a = m0Var4;
            b = new m0[]{m0Var, m0Var2, m0Var3, m0Var4};
        }

        public m0() {
            throw null;
        }

        public m0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static m0 valueOf(String str) {
            return (m0) Enum.valueOf(m0.class, str);
        }

        public static m0[] values() {
            return (m0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class m1 implements vn1<a> {
        public static final /* synthetic */ m1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        m1 EF8;

        static {
            a aVar = a.H0;
            a = new m1[]{new m1("inactive", 0, aVar, -1), new m1("control", 1, aVar, 0), new m1("phase_a_active", 2, aVar, 1)};
        }

        public m1() {
            throw null;
        }

        public m1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static m1 valueOf(String str) {
            return (m1) Enum.valueOf(m1.class, str);
        }

        public static m1[] values() {
            return (m1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class m2 implements vn1<a> {
        public static final m2 a;
        public static final /* synthetic */ m2[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        m2 EF0;

        static {
            a aVar = a.d2;
            m2 m2Var = new m2("inactive", 0, aVar, -1);
            m2 m2Var2 = new m2("control", 1, aVar, 0);
            m2 m2Var3 = new m2(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = m2Var3;
            b = new m2[]{m2Var, m2Var2, m2Var3};
        }

        public m2() {
            throw null;
        }

        public m2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static m2 valueOf(String str) {
            return (m2) Enum.valueOf(m2.class, str);
        }

        public static m2[] values() {
            return (m2[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class m3 implements vn1<a> {
        public static final /* synthetic */ m3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        m3 EF8;

        static {
            a aVar = a.f0;
            a = new m3[]{new m3("inactive", 0, aVar, -1), new m3("control", 1, aVar, 0), new m3("test1", 2, aVar, 1), new m3("test2", 3, aVar, 2)};
        }

        public m3() {
            throw null;
        }

        public m3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static m3 valueOf(String str) {
            return (m3) Enum.valueOf(m3.class, str);
        }

        public static m3[] values() {
            return (m3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class m4 implements vn1<a> {
        public static final /* synthetic */ m4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        m4 EF8;

        static {
            a aVar = a.M2;
            a = new m4[]{new m4("inactive", 0, aVar, -1), new m4("control", 1, aVar, 0), new m4("control_aa", 2, aVar, 1), new m4("tst", 3, aVar, 2)};
        }

        public m4() {
            throw null;
        }

        public m4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static m4 valueOf(String str) {
            return (m4) Enum.valueOf(m4.class, str);
        }

        public static m4[] values() {
            return (m4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class n implements vn1<a> {
        public static final /* synthetic */ n[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        n EF8;

        static {
            a aVar = a.P0;
            a = new n[]{new n("inactive", 0, aVar, -1), new n("control", 1, aVar, 0), new n("phase_a_active", 2, aVar, 1), new n("phase_b_only_match_subdomains_control", 3, aVar, 2), new n("phase_b_only_match_subdomains", 4, aVar, 3), new n("phase_b_only_tab_back_stack_control", 5, aVar, 4), new n("phase_b_only_tab_back_stack", 6, aVar, 5), new n("phase_b_inline_overlay_control", 7, aVar, 6), new n("phase_b_inline_overlay", 8, aVar, 7), new n("phase_b_control", 9, aVar, 8), new n("phase_b_active", 10, aVar, 9), new n("phase_c_hide_badge_names_control", 11, aVar, 10), new n("phase_c_hide_badge_names", 12, aVar, 11), new n("phase_c_control", 13, aVar, 12), new n("phase_c_active", 14, aVar, 13), new n("phase_c_hamburger", 15, aVar, 14), new n("phase_c_hamburger_control", 16, aVar, 15), new n("phase_c_scroll_up", 17, aVar, 16), new n("phase_c_scroll_up_control", 18, aVar, 17), new n("phase_c_hide_top_nav", 19, aVar, 18), new n("phase_c_hide_both_nav", 20, aVar, 19), new n("phase_c_hide_nav_control", 21, aVar, 20), new n("tare_nav_api_active", 22, aVar, 21), new n("tare_nav_api_control", 23, aVar, 22)};
        }

        public n() {
            throw null;
        }

        public n(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class n0 implements vn1<a> {
        public static final n0 a;
        public static final /* synthetic */ n0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        n0 EF0;

        static {
            a aVar = a.e;
            n0 n0Var = new n0("inactive", 0, aVar, -1);
            n0 n0Var2 = new n0("control", 1, aVar, 0);
            n0 n0Var3 = new n0("control_aa", 2, aVar, 1);
            n0 n0Var4 = new n0(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2);
            a = n0Var4;
            b = new n0[]{n0Var, n0Var2, n0Var3, n0Var4};
        }

        public n0() {
            throw null;
        }

        public n0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static n0 valueOf(String str) {
            return (n0) Enum.valueOf(n0.class, str);
        }

        public static n0[] values() {
            return (n0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class n1 implements vn1<a> {
        public static final /* synthetic */ n1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        n1 EF8;

        static {
            a aVar = a.S1;
            a = new n1[]{new n1("inactive", 0, aVar, -1), new n1("control", 1, aVar, 0), new n1("control_aa", 2, aVar, 1), new n1(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public n1() {
            throw null;
        }

        public n1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static n1 valueOf(String str) {
            return (n1) Enum.valueOf(n1.class, str);
        }

        public static n1[] values() {
            return (n1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class n2 implements vn1<a> {
        public static final n2 a;
        public static final n2 b;
        public static final /* synthetic */ n2[] c;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        n2 EF0;

        static {
            a aVar = a.s0;
            n2 n2Var = new n2("inactive", 0, aVar, -1);
            n2 n2Var2 = new n2("control", 1, aVar, 0);
            n2 n2Var3 = new n2("control_aa", 2, aVar, 1);
            n2 n2Var4 = new n2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2);
            a = n2Var4;
            n2 n2Var5 = new n2("active_95_modal", 4, aVar, 3);
            b = n2Var5;
            c = new n2[]{n2Var, n2Var2, n2Var3, n2Var4, n2Var5};
        }

        public n2() {
            throw null;
        }

        public n2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static n2 valueOf(String str) {
            return (n2) Enum.valueOf(n2.class, str);
        }

        public static n2[] values() {
            return (n2[]) c.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class n3 implements vn1<a> {
        public static final /* synthetic */ n3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        n3 EF8;

        static {
            a aVar = a.Y;
            a = new n3[]{new n3("inactive", 0, aVar, -1), new n3("control", 1, aVar, 0), new n3(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public n3() {
            throw null;
        }

        public n3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static n3 valueOf(String str) {
            return (n3) Enum.valueOf(n3.class, str);
        }

        public static n3[] values() {
            return (n3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class n4 implements vn1<a> {
        public static final /* synthetic */ n4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        n4 EF8;

        static {
            a aVar = a.N2;
            a = new n4[]{new n4("inactive", 0, aVar, -1), new n4("control", 1, aVar, 0), new n4("control_aa", 2, aVar, 1), new n4("tst", 3, aVar, 2)};
        }

        public n4() {
            throw null;
        }

        public n4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static n4 valueOf(String str) {
            return (n4) Enum.valueOf(n4.class, str);
        }

        public static n4[] values() {
            return (n4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class o implements vn1<a> {
        public static final /* synthetic */ o[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        o EF8;

        static {
            a aVar = a.Q0;
            a = new o[]{new o("inactive", 0, aVar, -1), new o("control", 1, aVar, 0), new o("ian_base_config", 2, aVar, 1), new o("depricated", 3, aVar, 2), new o("depricated_control", 4, aVar, 3), new o("ace_fifth_tab", 5, aVar, 4), new o("ace_fifth_tab_control", 6, aVar, 5), new o("search_fifth_tab", 7, aVar, 6), new o("search_fifth_tab_control", 8, aVar, 7)};
        }

        public o() {
            throw null;
        }

        public o(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static o valueOf(String str) {
            return (o) Enum.valueOf(o.class, str);
        }

        public static o[] values() {
            return (o[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class o0 implements vn1<a> {
        public static final o0 a;
        public static final /* synthetic */ o0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        o0 EF0;

        static {
            a aVar = a.V0;
            o0 o0Var = new o0("inactive", 0, aVar, -1);
            o0 o0Var2 = new o0("control", 1, aVar, 0);
            o0 o0Var3 = new o0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = o0Var3;
            b = new o0[]{o0Var, o0Var2, o0Var3};
        }

        public o0() {
            throw null;
        }

        public o0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static o0 valueOf(String str) {
            return (o0) Enum.valueOf(o0.class, str);
        }

        public static o0[] values() {
            return (o0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class o1 implements vn1<a> {
        public static final /* synthetic */ o1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        o1 EF8;

        static {
            a aVar = a.f1;
            a = new o1[]{new o1("inactive", 0, aVar, -1), new o1("control", 1, aVar, 0), new o1(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public o1() {
            throw null;
        }

        public o1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static o1 valueOf(String str) {
            return (o1) Enum.valueOf(o1.class, str);
        }

        public static o1[] values() {
            return (o1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class o2 implements vn1<a> {
        public static final /* synthetic */ o2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        o2 EF8;

        static {
            a aVar = a.B0;
            a = new o2[]{new o2("inactive", 0, aVar, -1), new o2("control", 1, aVar, 0), new o2(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public o2() {
            throw null;
        }

        public o2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static o2 valueOf(String str) {
            return (o2) Enum.valueOf(o2.class, str);
        }

        public static o2[] values() {
            return (o2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class o3 implements vn1<a> {
        public static final /* synthetic */ o3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        o3 EF8;

        static {
            a aVar = a.k2;
            a = new o3[]{new o3("inactive", 0, aVar, -1), new o3("control", 1, aVar, 0), new o3("autoPromptWithStreet", 2, aVar, 1), new o3("autoPromptNoStreet", 3, aVar, 2), new o3("manualPromptWithStreet", 4, aVar, 3), new o3("manualPromptNoStreet", 5, aVar, 4)};
        }

        public o3() {
            throw null;
        }

        public o3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static o3 valueOf(String str) {
            return (o3) Enum.valueOf(o3.class, str);
        }

        public static o3[] values() {
            return (o3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class o4 implements vn1<a> {
        public static final /* synthetic */ o4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        o4 EF8;

        static {
            a aVar = a.U2;
            a = new o4[]{new o4("inactive", 0, aVar, -1), new o4("control", 1, aVar, 0), new o4("control_aa", 2, aVar, 1), new o4("tst", 3, aVar, 2)};
        }

        public o4() {
            throw null;
        }

        public o4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static o4 valueOf(String str) {
            return (o4) Enum.valueOf(o4.class, str);
        }

        public static o4[] values() {
            return (o4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class p implements vn1<a> {
        public static final /* synthetic */ p[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        p EF8;

        static {
            a aVar = a.u2;
            a = new p[]{new p("inactive", 0, aVar, -1), new p("control", 1, aVar, 0), new p("test", 2, aVar, 1)};
        }

        public p() {
            throw null;
        }

        public p(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static p valueOf(String str) {
            return (p) Enum.valueOf(p.class, str);
        }

        public static p[] values() {
            return (p[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class p0 implements vn1<a> {
        public static final p0 a;
        public static final /* synthetic */ p0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        p0 EF0;

        static {
            a aVar = a.X0;
            p0 p0Var = new p0("inactive", 0, aVar, -1);
            p0 p0Var2 = new p0("control", 1, aVar, 0);
            p0 p0Var3 = new p0("full_gate", 2, aVar, 1);
            a = p0Var3;
            b = new p0[]{p0Var, p0Var2, p0Var3};
        }

        public p0() {
            throw null;
        }

        public p0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static p0 valueOf(String str) {
            return (p0) Enum.valueOf(p0.class, str);
        }

        public static p0[] values() {
            return (p0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class p1 implements vn1<a> {
        public static final /* synthetic */ p1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        p1 EF8;

        static {
            a aVar = a.h1;
            a = new p1[]{new p1("inactive", 0, aVar, -1), new p1("control", 1, aVar, 0), new p1(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public p1() {
            throw null;
        }

        public p1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static p1 valueOf(String str) {
            return (p1) Enum.valueOf(p1.class, str);
        }

        public static p1[] values() {
            return (p1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class p2 implements vn1<a> {
        public static final p2 a;
        public static final p2 b;
        public static final p2 c;
        public static final /* synthetic */ p2[] d;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        p2 EF0;

        static {
            a aVar = a.T0;
            p2 p2Var = new p2("inactive", 0, aVar, -1);
            p2 p2Var2 = new p2("control", 1, aVar, 0);
            p2 p2Var3 = new p2("phase_a_profile_location", 2, aVar, 1);
            a = p2Var3;
            p2 p2Var4 = new p2("phase_b_control", 3, aVar, 2);
            b = p2Var4;
            p2 p2Var5 = new p2("phase_b_combined_search", 4, aVar, 3);
            c = p2Var5;
            d = new p2[]{p2Var, p2Var2, p2Var3, p2Var4, p2Var5, new p2("reserved_b", 5, aVar, 4), new p2("reserved_c", 6, aVar, 5)};
        }

        public p2() {
            throw null;
        }

        public p2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static p2 valueOf(String str) {
            return (p2) Enum.valueOf(p2.class, str);
        }

        public static p2[] values() {
            return (p2[]) d.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class p3 implements vn1<a> {
        public static final /* synthetic */ p3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        p3 EF8;

        static {
            a aVar = a.a0;
            a = new p3[]{new p3("inactive", 0, aVar, -1), new p3("control", 1, aVar, 0), new p3("noRecentJob", 2, aVar, 1)};
        }

        public p3() {
            throw null;
        }

        public p3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static p3 valueOf(String str) {
            return (p3) Enum.valueOf(p3.class, str);
        }

        public static p3[] values() {
            return (p3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class p4 implements vn1<a> {
        public static final /* synthetic */ p4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        p4 EF8;

        static {
            a aVar = a.X2;
            a = new p4[]{new p4("inactive", 0, aVar, -1), new p4("control", 1, aVar, 0), new p4("control_aa", 2, aVar, 1), new p4("tst", 3, aVar, 2)};
        }

        public p4() {
            throw null;
        }

        public p4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static p4 valueOf(String str) {
            return (p4) Enum.valueOf(p4.class, str);
        }

        public static p4[] values() {
            return (p4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class q implements vn1<a> {
        public static final /* synthetic */ q[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        q EF8;

        static {
            a aVar = a.D2;
            a = new q[]{new q("inactive", 0, aVar, -1), new q("control", 1, aVar, 0), new q("test", 2, aVar, 1)};
        }

        public q() {
            throw null;
        }

        public q(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static q valueOf(String str) {
            return (q) Enum.valueOf(q.class, str);
        }

        public static q[] values() {
            return (q[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class q0 implements vn1<a> {
        public static final q0 a;
        public static final /* synthetic */ q0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        q0 EF0;

        static {
            a aVar = a.Z0;
            q0 q0Var = new q0("inactive", 0, aVar, -1);
            q0 q0Var2 = new q0("control", 1, aVar, 0);
            q0 q0Var3 = new q0("control_aa", 2, aVar, 1);
            q0 q0Var4 = new q0(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2);
            a = q0Var4;
            b = new q0[]{q0Var, q0Var2, q0Var3, q0Var4};
        }

        public q0() {
            throw null;
        }

        public q0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static q0 valueOf(String str) {
            return (q0) Enum.valueOf(q0.class, str);
        }

        public static q0[] values() {
            return (q0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class q1 implements vn1<a> {
        public static final /* synthetic */ q1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        q1 EF8;

        static {
            a aVar = a.g1;
            a = new q1[]{new q1("inactive", 0, aVar, -1), new q1("control", 1, aVar, 0), new q1("enableJobTypeAutoComplete", 2, aVar, 1), new q1("enableJobTypeAutoCompleteCanonOnly", 3, aVar, 2), new q1("enableJobTypeAutoCompleteCanonAltLabels", 4, aVar, 3)};
        }

        public q1() {
            throw null;
        }

        public q1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static q1 valueOf(String str) {
            return (q1) Enum.valueOf(q1.class, str);
        }

        public static q1[] values() {
            return (q1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class q2 implements vn1<a> {
        public static final q2 a;
        public static final /* synthetic */ q2[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        q2 EF0;

        static {
            a aVar = a.d1;
            q2 q2Var = new q2("inactive", 0, aVar, -1);
            q2 q2Var2 = new q2("control", 1, aVar, 0);
            q2 q2Var3 = new q2("control_aa", 2, aVar, 1);
            q2 q2Var4 = new q2("phase_a_active", 3, aVar, 2);
            a = q2Var4;
            b = new q2[]{q2Var, q2Var2, q2Var3, q2Var4};
        }

        public q2() {
            throw null;
        }

        public q2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static q2 valueOf(String str) {
            return (q2) Enum.valueOf(q2.class, str);
        }

        public static q2[] values() {
            return (q2[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class q3 implements vn1<a> {
        public static final /* synthetic */ q3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        q3 EF8;

        static {
            a aVar = a.Z;
            a = new q3[]{new q3("inactive", 0, aVar, -1), new q3("control", 1, aVar, 0), new q3("control_aa", 2, aVar, 1), new q3("active_except_for_crowtaxo_m3", 3, aVar, 2), new q3(AppStateModule.APP_STATE_ACTIVE, 4, aVar, 3)};
        }

        public q3() {
            throw null;
        }

        public q3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static q3 valueOf(String str) {
            return (q3) Enum.valueOf(q3.class, str);
        }

        public static q3[] values() {
            return (q3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class q4 implements vn1<a> {
        public static final /* synthetic */ q4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        q4 EF8;

        static {
            a aVar = a.V2;
            a = new q4[]{new q4("inactive", 0, aVar, -1), new q4("control", 1, aVar, 0), new q4("control_aa", 2, aVar, 1), new q4("tst", 3, aVar, 2)};
        }

        public q4() {
            throw null;
        }

        public q4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static q4 valueOf(String str) {
            return (q4) Enum.valueOf(q4.class, str);
        }

        public static q4[] values() {
            return (q4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class r implements vn1<a> {
        public static final /* synthetic */ r[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        r EF8;

        static {
            a aVar = a.q1;
            a = new r[]{new r("inactive", 0, aVar, -1), new r("control", 1, aVar, 0), new r("Degraded", 2, aVar, 1), new r("Unavailable", 3, aVar, 2)};
        }

        public r() {
            throw null;
        }

        public r(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static r valueOf(String str) {
            return (r) Enum.valueOf(r.class, str);
        }

        public static r[] values() {
            return (r[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class r0 implements vn1<a> {
        public static final /* synthetic */ r0[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        r0 EF8;

        static {
            a aVar = a.W0;
            a = new r0[]{new r0("inactive", 0, aVar, -1), new r0("control", 1, aVar, 0), new r0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public r0() {
            throw null;
        }

        public r0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static r0 valueOf(String str) {
            return (r0) Enum.valueOf(r0.class, str);
        }

        public static r0[] values() {
            return (r0[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class r1 implements vn1<a> {
        public static final r1 a;
        public static final /* synthetic */ r1[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        r1 EF0;

        static {
            a aVar = a.y0;
            r1 r1Var = new r1("inactive", 0, aVar, -1);
            r1 r1Var2 = new r1("control", 1, aVar, 0);
            r1 r1Var3 = new r1(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = r1Var3;
            b = new r1[]{r1Var, r1Var2, r1Var3};
        }

        public r1() {
            throw null;
        }

        public r1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static r1 valueOf(String str) {
            return (r1) Enum.valueOf(r1.class, str);
        }

        public static r1[] values() {
            return (r1[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class r2 implements vn1<a> {
        public static final r2 a;
        public static final /* synthetic */ r2[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        r2 EF0;

        static {
            a aVar = a.E0;
            r2 r2Var = new r2("inactive", 0, aVar, -1);
            r2 r2Var2 = new r2("control", 1, aVar, 0);
            r2 r2Var3 = new r2(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = r2Var3;
            b = new r2[]{r2Var, r2Var2, r2Var3};
        }

        public r2() {
            throw null;
        }

        public r2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static r2 valueOf(String str) {
            return (r2) Enum.valueOf(r2.class, str);
        }

        public static r2[] values() {
            return (r2[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class r3 implements vn1<a> {
        public static final /* synthetic */ r3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        r3 EF8;

        static {
            a aVar = a.d0;
            a = new r3[]{new r3("inactive", 0, aVar, -1), new r3("control", 1, aVar, 0), new r3("split_remote_flow", 2, aVar, 1)};
        }

        public r3() {
            throw null;
        }

        public r3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static r3 valueOf(String str) {
            return (r3) Enum.valueOf(r3.class, str);
        }

        public static r3[] values() {
            return (r3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class r4 implements vn1<a> {
        public static final /* synthetic */ r4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        r4 EF8;

        static {
            a aVar = a.O2;
            a = new r4[]{new r4("inactive", 0, aVar, -1), new r4("control", 1, aVar, 0), new r4("control_aa", 2, aVar, 1), new r4("tst", 3, aVar, 2)};
        }

        public r4() {
            throw null;
        }

        public r4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static r4 valueOf(String str) {
            return (r4) Enum.valueOf(r4.class, str);
        }

        public static r4[] values() {
            return (r4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class s implements vn1<a> {
        public static final /* synthetic */ s[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        s EF8;

        static {
            a aVar = a.p1;
            a = new s[]{new s("inactive", 0, aVar, -1), new s("control", 1, aVar, 0), new s("test", 2, aVar, 1)};
        }

        public s() {
            throw null;
        }

        public s(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static s valueOf(String str) {
            return (s) Enum.valueOf(s.class, str);
        }

        public static s[] values() {
            return (s[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class s0 implements vn1<a> {
        public static final s0 a;
        public static final /* synthetic */ s0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        s0 EF0;

        static {
            a aVar = a.U1;
            s0 s0Var = new s0("inactive", 0, aVar, -1);
            s0 s0Var2 = new s0("control", 1, aVar, 0);
            s0 s0Var3 = new s0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = s0Var3;
            b = new s0[]{s0Var, s0Var2, s0Var3};
        }

        public s0() {
            throw null;
        }

        public s0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static s0 valueOf(String str) {
            return (s0) Enum.valueOf(s0.class, str);
        }

        public static s0[] values() {
            return (s0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class s1 implements vn1<a> {
        public static final s1 a;
        public static final /* synthetic */ s1[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        s1 EF0;

        static {
            a aVar = a.j2;
            s1 s1Var = new s1("inactive", 0, aVar, -1);
            s1 s1Var2 = new s1("control", 1, aVar, 0);
            s1 s1Var3 = new s1(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = s1Var3;
            b = new s1[]{s1Var, s1Var2, s1Var3};
        }

        public s1() {
            throw null;
        }

        public s1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static s1 valueOf(String str) {
            return (s1) Enum.valueOf(s1.class, str);
        }

        public static s1[] values() {
            return (s1[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class s2 implements vn1<a> {
        public static final s2 a;
        public static final /* synthetic */ s2[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        s2 EF0;

        static {
            a aVar = a.i0;
            s2 s2Var = new s2("inactive", 0, aVar, -1);
            s2 s2Var2 = new s2("control", 1, aVar, 0);
            s2 s2Var3 = new s2(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = s2Var3;
            b = new s2[]{s2Var, s2Var2, s2Var3};
        }

        public s2() {
            throw null;
        }

        public s2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static s2 valueOf(String str) {
            return (s2) Enum.valueOf(s2.class, str);
        }

        public static s2[] values() {
            return (s2[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class s3 implements vn1<a> {
        public static final /* synthetic */ s3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        s3 EF8;

        static {
            a aVar = a.e0;
            a = new s3[]{new s3("inactive", 0, aVar, -1), new s3("control", 1, aVar, 0), new s3("skipYear", 2, aVar, 1)};
        }

        public s3() {
            throw null;
        }

        public s3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static s3 valueOf(String str) {
            return (s3) Enum.valueOf(s3.class, str);
        }

        public static s3[] values() {
            return (s3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class s4 implements vn1<a> {
        public static final /* synthetic */ s4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        s4 EF8;

        static {
            a aVar = a.P2;
            a = new s4[]{new s4("inactive", 0, aVar, -1), new s4("control", 1, aVar, 0), new s4("control_aa", 2, aVar, 1), new s4("tst", 3, aVar, 2)};
        }

        public s4() {
            throw null;
        }

        public s4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static s4 valueOf(String str) {
            return (s4) Enum.valueOf(s4.class, str);
        }

        public static s4[] values() {
            return (s4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class t implements vn1<a> {
        public static final /* synthetic */ t[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        t EF8;

        static {
            a aVar = a.x1;
            a = new t[]{new t("inactive", 0, aVar, -1), new t("control", 1, aVar, 0), new t(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public t() {
            throw null;
        }

        public t(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static t valueOf(String str) {
            return (t) Enum.valueOf(t.class, str);
        }

        public static t[] values() {
            return (t[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class t0 implements vn1<a> {
        public static final /* synthetic */ t0[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        t0 EF8;

        static {
            a aVar = a.U0;
            a = new t0[]{new t0("inactive", 0, aVar, -1), new t0("control", 1, aVar, 0), new t0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public t0() {
            throw null;
        }

        public t0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static t0 valueOf(String str) {
            return (t0) Enum.valueOf(t0.class, str);
        }

        public static t0[] values() {
            return (t0[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class t1 implements vn1<a> {
        public static final /* synthetic */ t1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        t1 EF8;

        static {
            a aVar = a.c1;
            a = new t1[]{new t1("inactive", 0, aVar, -1), new t1("control", 1, aVar, 0), new t1("control_aa", 2, aVar, 1), new t1(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2), new t1("reserved_a", 4, aVar, 3), new t1("reserved_b", 5, aVar, 4), new t1("reserved_c", 6, aVar, 5)};
        }

        public t1() {
            throw null;
        }

        public t1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static t1 valueOf(String str) {
            return (t1) Enum.valueOf(t1.class, str);
        }

        public static t1[] values() {
            return (t1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class t2 implements vn1<a> {
        public static final t2 a;
        public static final /* synthetic */ t2[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        t2 EF0;

        static {
            a aVar = a.w0;
            t2 t2Var = new t2("inactive", 0, aVar, -1);
            t2 t2Var2 = new t2("control", 1, aVar, 0);
            t2 t2Var3 = new t2("control_aa", 2, aVar, 1);
            t2 t2Var4 = new t2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2);
            a = t2Var4;
            b = new t2[]{t2Var, t2Var2, t2Var3, t2Var4};
        }

        public t2() {
            throw null;
        }

        public t2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static t2 valueOf(String str) {
            return (t2) Enum.valueOf(t2.class, str);
        }

        public static t2[] values() {
            return (t2[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class t3 implements vn1<a> {
        public static final /* synthetic */ t3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        t3 EF8;

        static {
            a aVar = a.b2;
            a = new t3[]{new t3("inactive", 0, aVar, -1), new t3("control", 1, aVar, 0), new t3("serpPrompt", 2, aVar, 1), new t3("disableMicrocontent", 3, aVar, 2)};
        }

        public t3() {
            throw null;
        }

        public t3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static t3 valueOf(String str) {
            return (t3) Enum.valueOf(t3.class, str);
        }

        public static t3[] values() {
            return (t3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class t4 implements vn1<a> {
        public static final /* synthetic */ t4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        t4 EF8;

        static {
            a aVar = a.W2;
            a = new t4[]{new t4("inactive", 0, aVar, -1), new t4("control", 1, aVar, 0), new t4("control_aa", 2, aVar, 1), new t4("tst", 3, aVar, 2)};
        }

        public t4() {
            throw null;
        }

        public t4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static t4 valueOf(String str) {
            return (t4) Enum.valueOf(t4.class, str);
        }

        public static t4[] values() {
            return (t4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class u implements vn1<a> {
        public static final /* synthetic */ u[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        u EF8;

        static {
            a aVar = a.n1;
            a = new u[]{new u("inactive", 0, aVar, -1), new u("control", 1, aVar, 0), new u(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public u() {
            throw null;
        }

        public u(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static u valueOf(String str) {
            return (u) Enum.valueOf(u.class, str);
        }

        public static u[] values() {
            return (u[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class u0 implements vn1<a> {
        public static final u0 a;
        public static final /* synthetic */ u0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        u0 EF0;

        static {
            a aVar = a.Y0;
            u0 u0Var = new u0("inactive", 0, aVar, -1);
            u0 u0Var2 = new u0("control", 1, aVar, 0);
            u0 u0Var3 = new u0("control_aa", 2, aVar, 1);
            u0 u0Var4 = new u0(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2);
            a = u0Var4;
            b = new u0[]{u0Var, u0Var2, u0Var3, u0Var4};
        }

        public u0() {
            throw null;
        }

        public u0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static u0 valueOf(String str) {
            return (u0) Enum.valueOf(u0.class, str);
        }

        public static u0[] values() {
            return (u0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class u1 implements vn1<a> {
        public static final /* synthetic */ u1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        u1 EF8;

        static {
            a aVar = a.O1;
            a = new u1[]{new u1("inactive", 0, aVar, -1), new u1("control", 1, aVar, 0), new u1(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public u1() {
            throw null;
        }

        public u1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static u1 valueOf(String str) {
            return (u1) Enum.valueOf(u1.class, str);
        }

        public static u1[] values() {
            return (u1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class u2 implements vn1<a> {
        public static final u2 a;
        public static final /* synthetic */ u2[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        u2 EF0;

        static {
            a aVar = a.F0;
            u2 u2Var = new u2("inactive", 0, aVar, -1);
            u2 u2Var2 = new u2("control", 1, aVar, 0);
            u2 u2Var3 = new u2("control_aa", 2, aVar, 1);
            u2 u2Var4 = new u2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2);
            a = u2Var4;
            b = new u2[]{u2Var, u2Var2, u2Var3, u2Var4, new u2("reserved_a", 4, aVar, 3), new u2("reserved_b", 5, aVar, 4), new u2("reserved_c", 6, aVar, 5)};
        }

        public u2() {
            throw null;
        }

        public u2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static u2 valueOf(String str) {
            return (u2) Enum.valueOf(u2.class, str);
        }

        public static u2[] values() {
            return (u2[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class u3 implements vn1<a> {
        public static final /* synthetic */ u3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        u3 EF8;

        static {
            a aVar = a.b1;
            a = new u3[]{new u3("inactive", 0, aVar, -1), new u3("control", 1, aVar, 0), new u3("control_aa", 2, aVar, 1), new u3(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2)};
        }

        public u3() {
            throw null;
        }

        public u3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static u3 valueOf(String str) {
            return (u3) Enum.valueOf(u3.class, str);
        }

        public static u3[] values() {
            return (u3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class u4 implements vn1<a> {
        public static final /* synthetic */ u4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        u4 EF8;

        static {
            a aVar = a.Q2;
            a = new u4[]{new u4("inactive", 0, aVar, -1), new u4("control", 1, aVar, 0), new u4("control_aa", 2, aVar, 1), new u4("tst", 3, aVar, 2)};
        }

        public u4() {
            throw null;
        }

        public u4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static u4 valueOf(String str) {
            return (u4) Enum.valueOf(u4.class, str);
        }

        public static u4[] values() {
            return (u4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class v implements vn1<a> {
        public static final /* synthetic */ v[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        v EF8;

        static {
            a aVar = a.y1;
            a = new v[]{new v("inactive", 0, aVar, -1), new v("control", 1, aVar, 0), new v(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public v() {
            throw null;
        }

        public v(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static v valueOf(String str) {
            return (v) Enum.valueOf(v.class, str);
        }

        public static v[] values() {
            return (v[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class v0 implements vn1<a> {
        public static final /* synthetic */ v0[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        v0 EF8;

        static {
            a aVar = a.M1;
            a = new v0[]{new v0("inactive", 0, aVar, -1), new v0("control", 1, aVar, 0), new v0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1), new v0("active_phase_b", 3, aVar, 2)};
        }

        public v0() {
            throw null;
        }

        public v0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static v0 valueOf(String str) {
            return (v0) Enum.valueOf(v0.class, str);
        }

        public static v0[] values() {
            return (v0[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class v1 implements vn1<a> {
        public static final /* synthetic */ v1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        v1 EF8;

        static {
            a aVar = a.P1;
            a = new v1[]{new v1("inactive", 0, aVar, -1), new v1("control", 1, aVar, 0), new v1(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public v1() {
            throw null;
        }

        public v1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static v1 valueOf(String str) {
            return (v1) Enum.valueOf(v1.class, str);
        }

        public static v1[] values() {
            return (v1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class v2 implements vn1<a> {
        public static final v2 a;
        public static final /* synthetic */ v2[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        v2 EF0;

        static {
            a aVar = a.z0;
            v2 v2Var = new v2("inactive", 0, aVar, -1);
            v2 v2Var2 = new v2("control", 1, aVar, 0);
            v2 v2Var3 = new v2("control_aa", 2, aVar, 1);
            v2 v2Var4 = new v2(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2);
            a = v2Var4;
            b = new v2[]{v2Var, v2Var2, v2Var3, v2Var4};
        }

        public v2() {
            throw null;
        }

        public v2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static v2 valueOf(String str) {
            return (v2) Enum.valueOf(v2.class, str);
        }

        public static v2[] values() {
            return (v2[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class v3 implements vn1<a> {
        public static final /* synthetic */ v3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        v3 EF8;

        static {
            a aVar = a.J0;
            a = new v3[]{new v3("inactive", 0, aVar, -1), new v3("control", 1, aVar, 0), new v3("phase_a_active", 2, aVar, 1), new v3("phase_b_only_match_subdomains_control", 3, aVar, 2), new v3("phase_b_only_match_subdomains", 4, aVar, 3), new v3("phase_b_only_tab_back_stack_control", 5, aVar, 4), new v3("phase_b_only_tab_back_stack", 6, aVar, 5), new v3("phase_b_inline_overlay_control", 7, aVar, 6), new v3("phase_b_inline_overlay", 8, aVar, 7), new v3("phase_b_control", 9, aVar, 8), new v3("phase_b_active", 10, aVar, 9), new v3("phase_c_hide_badge_names_control", 11, aVar, 10), new v3("phase_c_hide_badge_names", 12, aVar, 11), new v3("phase_c_control", 13, aVar, 12), new v3("phase_c_active", 14, aVar, 13), new v3("phase_c_hamburger", 15, aVar, 14), new v3("phase_c_hamburger_control", 16, aVar, 15), new v3("phase_c_scroll_up", 17, aVar, 16), new v3("phase_c_scroll_up_control", 18, aVar, 17), new v3("phase_c_hide_top_nav", 19, aVar, 18), new v3("phase_c_hide_both_nav", 20, aVar, 19), new v3("phase_c_hide_nav_control", 21, aVar, 20), new v3("tare_nav_api_active", 22, aVar, 21), new v3("tare_nav_api_control", 23, aVar, 22)};
        }

        public v3() {
            throw null;
        }

        public v3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static v3 valueOf(String str) {
            return (v3) Enum.valueOf(v3.class, str);
        }

        public static v3[] values() {
            return (v3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class v4 implements vn1<a> {
        public static final /* synthetic */ v4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        v4 EF8;

        static {
            a aVar = a.R2;
            a = new v4[]{new v4("inactive", 0, aVar, -1), new v4("control", 1, aVar, 0), new v4("control_aa", 2, aVar, 1), new v4("tst", 3, aVar, 2)};
        }

        public v4() {
            throw null;
        }

        public v4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static v4 valueOf(String str) {
            return (v4) Enum.valueOf(v4.class, str);
        }

        public static v4[] values() {
            return (v4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class w implements vn1<a> {
        public static final /* synthetic */ w[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        w EF8;

        static {
            a aVar = a.T1;
            a = new w[]{new w("inactive", 0, aVar, -1), new w("control", 1, aVar, 0), new w(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public w() {
            throw null;
        }

        public w(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static w valueOf(String str) {
            return (w) Enum.valueOf(w.class, str);
        }

        public static w[] values() {
            return (w[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class w0 implements vn1<a> {
        public static final w0 a;
        public static final w0 b;
        public static final /* synthetic */ w0[] c;
        private final String description;
        private final a proctorTest;
        private final int value;

        static {
            a aVar = a.n0;
            w0 w0Var = new w0("inactive", 0, aVar, -1);
            a = w0Var;
            w0 w0Var2 = new w0("control", 1, aVar, 0);
            w0 w0Var3 = new w0("control_aa", 2, aVar, 1);
            w0 w0Var4 = new w0(AppStateModule.APP_STATE_ACTIVE, 3, aVar, 2);
            b = w0Var4;
            c = new w0[]{w0Var, w0Var2, w0Var3, w0Var4};
        }

        public w0() {
            throw null;
        }

        public w0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static w0 valueOf(String str) {
            return (w0) Enum.valueOf(w0.class, str);
        }

        public static w0[] values() {
            return (w0[]) c.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class w1 implements vn1<a> {
        public static final /* synthetic */ w1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        w1 EF8;

        static {
            a aVar = a.a2;
            a = new w1[]{new w1("inactive", 0, aVar, -1), new w1("control", 1, aVar, 0), new w1(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public w1() {
            throw null;
        }

        public w1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static w1 valueOf(String str) {
            return (w1) Enum.valueOf(w1.class, str);
        }

        public static w1[] values() {
            return (w1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class w2 implements vn1<a> {
        public static final /* synthetic */ w2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        w2 EF8;

        static {
            a aVar = a.X1;
            a = new w2[]{new w2("inactive", 0, aVar, -1), new w2("control", 1, aVar, 0), new w2("active_grp1", 2, aVar, 1), new w2("phase_b_control", 3, aVar, 2), new w2("phase_b_active", 4, aVar, 3)};
        }

        public w2() {
            throw null;
        }

        public w2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static w2 valueOf(String str) {
            return (w2) Enum.valueOf(w2.class, str);
        }

        public static w2[] values() {
            return (w2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class w3 implements vn1<a> {
        public static final /* synthetic */ w3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        w3 EF8;

        static {
            a aVar = a.K0;
            a = new w3[]{new w3("inactive", 0, aVar, -1), new w3("control", 1, aVar, 0), new w3("ian_base_config", 2, aVar, 1), new w3("depricated", 3, aVar, 2), new w3("depricated_control", 4, aVar, 3), new w3("ace_fifth_tab", 5, aVar, 4), new w3("ace_fifth_tab_control", 6, aVar, 5), new w3("search_fifth_tab_control", 7, aVar, 6), new w3("search_fifth_tab", 8, aVar, 7)};
        }

        public w3() {
            throw null;
        }

        public w3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static w3 valueOf(String str) {
            return (w3) Enum.valueOf(w3.class, str);
        }

        public static w3[] values() {
            return (w3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class w4 implements vn1<a> {
        public static final /* synthetic */ w4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        w4 EF8;

        static {
            a aVar = a.Y2;
            a = new w4[]{new w4("inactive", 0, aVar, -1), new w4("control", 1, aVar, 0), new w4("control_aa", 2, aVar, 1), new w4("tst", 3, aVar, 2)};
        }

        public w4() {
            throw null;
        }

        public w4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static w4 valueOf(String str) {
            return (w4) Enum.valueOf(w4.class, str);
        }

        public static w4[] values() {
            return (w4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class x implements vn1<a> {
        public static final /* synthetic */ x[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        x EF8;

        static {
            a aVar = a.w2;
            a = new x[]{new x("inactive", 0, aVar, -1), new x("control", 1, aVar, 0), new x("test", 2, aVar, 1)};
        }

        public x() {
            throw null;
        }

        public x(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static x valueOf(String str) {
            return (x) Enum.valueOf(x.class, str);
        }

        public static x[] values() {
            return (x[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class x0 implements vn1<a> {
        public static final x0 a;
        public static final /* synthetic */ x0[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        x0 EF0;

        static {
            a aVar = a.p0;
            x0 x0Var = new x0("inactive", 0, aVar, -1);
            x0 x0Var2 = new x0("control", 1, aVar, 0);
            x0 x0Var3 = new x0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = x0Var3;
            b = new x0[]{x0Var, x0Var2, x0Var3};
        }

        public x0() {
            throw null;
        }

        public x0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static x0 valueOf(String str) {
            return (x0) Enum.valueOf(x0.class, str);
        }

        public static x0[] values() {
            return (x0[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class x1 implements vn1<a> {
        public static final x1 a;
        public static final x1 b;
        public static final x1 c;
        public static final x1 d;
        public static final /* synthetic */ x1[] e;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        x1 EF0;

        static {
            a aVar = a.r0;
            x1 x1Var = new x1("inactive", 0, aVar, -1);
            x1 x1Var2 = new x1("control", 1, aVar, 0);
            x1 x1Var3 = new x1("control_aa", 2, aVar, 1);
            x1 x1Var4 = new x1("active_phase_a", 3, aVar, 2);
            a = x1Var4;
            x1 x1Var5 = new x1("control_phase_b", 4, aVar, 3);
            x1 x1Var6 = new x1("active_phase_b", 5, aVar, 4);
            b = x1Var6;
            x1 x1Var7 = new x1("reserved_c_control", 6, aVar, 5);
            x1 x1Var8 = new x1("active_phase_c", 7, aVar, 6);
            c = x1Var8;
            x1 x1Var9 = new x1("reserved_d_control", 8, aVar, 7);
            x1 x1Var10 = new x1("active_phase_d", 9, aVar, 8);
            d = x1Var10;
            e = new x1[]{x1Var, x1Var2, x1Var3, x1Var4, x1Var5, x1Var6, x1Var7, x1Var8, x1Var9, x1Var10};
        }

        public x1() {
            throw null;
        }

        public x1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static x1 valueOf(String str) {
            return (x1) Enum.valueOf(x1.class, str);
        }

        public static x1[] values() {
            return (x1[]) e.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class x2 implements vn1<a> {
        public static final /* synthetic */ x2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        x2 EF8;

        static {
            a aVar = a.u1;
            a = new x2[]{new x2("inactive", 0, aVar, -1), new x2("control", 1, aVar, 0), new x2(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public x2() {
            throw null;
        }

        public x2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static x2 valueOf(String str) {
            return (x2) Enum.valueOf(x2.class, str);
        }

        public static x2[] values() {
            return (x2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class x3 implements vn1<a> {
        public static final /* synthetic */ x3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        x3 EF8;

        static {
            a aVar = a.q2;
            a = new x3[]{new x3("inactive", 0, aVar, -1), new x3("control", 1, aVar, 0), new x3("test", 2, aVar, 1)};
        }

        public x3() {
            throw null;
        }

        public x3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static x3 valueOf(String str) {
            return (x3) Enum.valueOf(x3.class, str);
        }

        public static x3[] values() {
            return (x3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class x4 implements vn1<a> {
        public static final /* synthetic */ x4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        x4 EF8;

        static {
            a aVar = a.S2;
            a = new x4[]{new x4("inactive", 0, aVar, -1), new x4("control", 1, aVar, 0), new x4("test", 2, aVar, 1)};
        }

        public x4() {
            throw null;
        }

        public x4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static x4 valueOf(String str) {
            return (x4) Enum.valueOf(x4.class, str);
        }

        public static x4[] values() {
            return (x4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class y implements vn1<a> {
        public static final y a;
        public static final /* synthetic */ y[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        y EF0;

        static {
            a aVar = a.g0;
            y yVar = new y("inactive", 0, aVar, -1);
            y yVar2 = new y("control", 1, aVar, 0);
            y yVar3 = new y(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1);
            a = yVar3;
            b = new y[]{yVar, yVar2, yVar3};
        }

        public y() {
            throw null;
        }

        public y(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static y valueOf(String str) {
            return (y) Enum.valueOf(y.class, str);
        }

        public static y[] values() {
            return (y[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class y0 implements vn1<a> {
        public static final /* synthetic */ y0[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        y0 EF8;

        static {
            a aVar = a.w1;
            a = new y0[]{new y0("inactive", 0, aVar, -1), new y0("control", 1, aVar, 0), new y0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public y0() {
            throw null;
        }

        public y0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static y0 valueOf(String str) {
            return (y0) Enum.valueOf(y0.class, str);
        }

        public static y0[] values() {
            return (y0[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class y1 implements vn1<a> {
        public static final /* synthetic */ y1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        y1 EF8;

        static {
            a aVar = a.q0;
            a = new y1[]{new y1("inactive", 0, aVar, -1), new y1("control", 1, aVar, 0), new y1(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public y1() {
            throw null;
        }

        public y1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static y1 valueOf(String str) {
            return (y1) Enum.valueOf(y1.class, str);
        }

        public static y1[] values() {
            return (y1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class y2 implements vn1<a> {
        public static final /* synthetic */ y2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        y2 EF8;

        static {
            a aVar = a.r1;
            a = new y2[]{new y2("inactive", 0, aVar, -1), new y2("control", 1, aVar, 0), new y2("test", 2, aVar, 1)};
        }

        public y2() {
            throw null;
        }

        public y2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static y2 valueOf(String str) {
            return (y2) Enum.valueOf(y2.class, str);
        }

        public static y2[] values() {
            return (y2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class y3 implements vn1<a> {
        public static final /* synthetic */ y3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        y3 EF8;

        static {
            a aVar = a.p2;
            a = new y3[]{new y3("inactive", 0, aVar, -1), new y3("control", 1, aVar, 0), new y3("optin_benefit", 2, aVar, 1), new y3("fomo", 3, aVar, 2)};
        }

        public y3() {
            throw null;
        }

        public y3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static y3 valueOf(String str) {
            return (y3) Enum.valueOf(y3.class, str);
        }

        public static y3[] values() {
            return (y3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class y4 implements vn1<a> {
        public static final /* synthetic */ y4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        y4 EF8;

        static {
            a aVar = a.N1;
            a = new y4[]{new y4("inactive", 0, aVar, -1), new y4("control", 1, aVar, 0), new y4(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public y4() {
            throw null;
        }

        public y4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static y4 valueOf(String str) {
            return (y4) Enum.valueOf(y4.class, str);
        }

        public static y4[] values() {
            return (y4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class z implements vn1<a> {
        public static final z a;
        public static final /* synthetic */ z[] b;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        z EF0;

        static {
            a aVar = a.Z2;
            z zVar = new z("inactive", 0, aVar, -1);
            z zVar2 = new z("control", 1, aVar, 0);
            z zVar3 = new z("test", 2, aVar, 1);
            a = zVar3;
            b = new z[]{zVar, zVar2, zVar3};
        }

        public z() {
            throw null;
        }

        public z(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static z valueOf(String str) {
            return (z) Enum.valueOf(z.class, str);
        }

        public static z[] values() {
            return (z[]) b.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class z0 implements vn1<a> {
        public static final /* synthetic */ z0[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        z0 EF8;

        static {
            a aVar = a.o0;
            a = new z0[]{new z0("inactive", 0, aVar, -1), new z0("control", 1, aVar, 0), new z0(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1)};
        }

        public z0() {
            throw null;
        }

        public z0(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static z0 valueOf(String str) {
            return (z0) Enum.valueOf(z0.class, str);
        }

        public static z0[] values() {
            return (z0[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class z1 implements vn1<a> {
        public static final /* synthetic */ z1[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        z1 EF8;

        static {
            a aVar = a.Z1;
            a = new z1[]{new z1("inactive", 0, aVar, -1), new z1("control", 1, aVar, 0), new z1("phase_a_active", 2, aVar, 1), new z1("phase_b_control", 3, aVar, 2), new z1("phase_b_active", 4, aVar, 3)};
        }

        public z1() {
            throw null;
        }

        public z1(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static z1 valueOf(String str) {
            return (z1) Enum.valueOf(z1.class, str);
        }

        public static z1[] values() {
            return (z1[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class z2 implements vn1<a> {
        public static final /* synthetic */ z2[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        z2 EF8;

        static {
            a aVar = a.l1;
            a = new z2[]{new z2("inactive", 0, aVar, -1), new z2("control", 1, aVar, 0), new z2("mobile_MVP", 2, aVar, 1), new z2("desktop", 3, aVar, 2), new z2("reloVertSecond", 4, aVar, 3), new z2("JP_autoSourcer", 5, aVar, 4), new z2("controlRelo", 6, aVar, 5), new z2("reloCaroSecond", 7, aVar, 6), new z2("no_GroupedHP", 8, aVar, 7), new z2("grp8", 9, aVar, 8), new z2("grp9", 10, aVar, 9), new z2("grp10", 11, aVar, 10), new z2("grp11", 12, aVar, 11), new z2("grp12", 13, aVar, 12), new z2("grp13", 14, aVar, 13), new z2("JP_only_JobsForYou", 15, aVar, 14), new z2("grp15", 16, aVar, 15), new z2("longCommuteThird", 17, aVar, 16), new z2("control17", 18, aVar, 17), new z2("test18", 19, aVar, 18), new z2("control19", 20, aVar, 19), new z2("test20", 21, aVar, 20), new z2("test21", 22, aVar, 21), new z2("test22", 23, aVar, 22), new z2("test23", 24, aVar, 23), new z2("control24", 25, aVar, 24), new z2("test25", 26, aVar, 25), new z2("test26", 27, aVar, 26), new z2("test27", 28, aVar, 27), new z2("test28", 29, aVar, 28), new z2("test29", 30, aVar, 29), new z2("test30", 31, aVar, 30), new z2("test31", 32, aVar, 31), new z2("test32", 33, aVar, 32), new z2("test33", 34, aVar, 33), new z2("test34", 35, aVar, 34), new z2("test35", 36, aVar, 35), new z2("control36", 37, aVar, 36), new z2("control_copy21", 38, aVar, 37), new z2("lastApply", 39, aVar, 38), new z2("control_desktop", 40, aVar, 39), new z2("desktop_lastApply", 41, aVar, 40), new z2("mobile41", 42, aVar, 41), new z2("desktop42", 43, aVar, 42), new z2("control_copy41", 44, aVar, 43), new z2("test_carousel1", 45, aVar, 44), new z2("test_carousel2", 46, aVar, 45), new z2("test_carousel3", 47, aVar, 46), new z2("test_carouselScroll1", 48, aVar, 47), new z2("test_carouselScroll2", 49, aVar, 48), new z2("mobile49", 50, aVar, 49), new z2("desktop50", 51, aVar, 50), new z2("desktop51", 52, aVar, 51), new z2("mobile_crowtaxo_m3_control52", 53, aVar, 52), new z2("mobile_crowtaxo_m3_test53", 54, aVar, 53), new z2("desktop_crowtaxo_m3_control54", 55, aVar, 54), new z2("desktop_crowtaxo_m3_test55", 56, aVar, 55), new z2("ios_control56", 57, aVar, 56), new z2("ios_crowtaxo_m3_control57", 58, aVar, 57), new z2("ios_crowtaxo_m3_test58", 59, aVar, 58), new z2("test_carouselScroll3", 60, aVar, 59), new z2("mobile_crowtaxo_p3_iteration2_ctrl_60", 61, aVar, 60), new z2("mobile_crowtaxo_p3_iteration2_test_61", 62, aVar, 61), new z2("mobile_crowtaxo_p3_iteration2_test_62", 63, aVar, 62), new z2("desktop_crowtaxo_p3_iteration2_ctrl_63", 64, aVar, 63), new z2("desktop_crowtaxo_p3_iteration2_test_64", 65, aVar, 64), new z2("desktop_crowtaxo_p3_iteration2_test_65", 66, aVar, 65), new z2("control_mobile", 67, aVar, 66), new z2("test_carousel_v2_1", 68, aVar, 67), new z2("test_carousel_v2_2", 69, aVar, 68), new z2("test_carousel_v2_3", 70, aVar, 69), new z2("US_employerOutreach", 71, aVar, 70), new z2("JP_mobile_jobsForYou_autoSourcerBlended", 72, aVar, 71), new z2("test_carousel_v2_4", 73, aVar, 72), new z2("test_carousel_v2_5", 74, aVar, 73), new z2("test_carousel_v2_6", 75, aVar, 74), new z2("test_carousel_v2_7", 76, aVar, 75), new z2("test_carousel_v2_8", 77, aVar, 76), new z2("test_carousel_v2_9", 78, aVar, 77), new z2("extended_us_hp_fifteen_aa_plus", 79, aVar, 78), new z2("extended_us_hpd_fifteen_aa_plus", 80, aVar, 79), new z2("CA_mobile", 81, aVar, 80), new z2("CA_desktop", 82, aVar, 81), new z2("CA_mobile_with_assistedApply", 83, aVar, 82), new z2("mobile_remove_pagination_control", 84, aVar, 83), new z2("mobile_remove_pagination_limit10", 85, aVar, 84), new z2("mobile_remove_pagination_limit100", 86, aVar, 85), new z2("desktop_remove_pagination_control", 87, aVar, 86), new z2("desktop_remove_pagination_limit10", 88, aVar, 87), new z2("desktop_remove_pagination_limit100", 89, aVar, 88), new z2("control_employerOutreach", 90, aVar, 89), new z2("employerOutreach_AS_PMC", 91, aVar, 90), new z2("employerOutreach_AS_PMC_SS", 92, aVar, 91)};
        }

        public z2() {
            throw null;
        }

        public z2(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static z2 valueOf(String str) {
            return (z2) Enum.valueOf(z2.class, str);
        }

        public static z2[] values() {
            return (z2[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class z3 implements vn1<a> {
        public static final /* synthetic */ z3[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        z3 EF8;

        static {
            a aVar = a.B2;
            a = new z3[]{new z3("inactive", 0, aVar, -1), new z3("control", 1, aVar, 0), new z3(AppStateModule.APP_STATE_ACTIVE, 2, aVar, 1), new z3("no_skip_btn", 3, aVar, 2)};
        }

        public z3() {
            throw null;
        }

        public z3(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static z3 valueOf(String str) {
            return (z3) Enum.valueOf(z3.class, str);
        }

        public static z3[] values() {
            return (z3[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class z4 implements vn1<a> {
        public static final /* synthetic */ z4[] a;
        private final String description;
        private final a proctorTest;
        private final int value;

        /* JADX INFO: Fake field, exist only in values array */
        z4 EF8;

        static {
            a aVar = a.l2;
            a = new z4[]{new z4("inactive", 0, aVar, -1), new z4("control", 1, aVar, 0), new z4("test", 2, aVar, 1)};
        }

        public z4() {
            throw null;
        }

        public z4(String str, int i, a aVar, int i2) {
            this.proctorTest = aVar;
            this.value = i2;
            this.description = null;
        }

        public static z4 valueOf(String str) {
            return (z4) Enum.valueOf(z4.class, str);
        }

        public static z4[] values() {
            return (z4[]) a.clone();
        }

        @Override // defpackage.vn1
        public final a a() {
            return this.proctorTest;
        }

        @Override // defpackage.vn1
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.vn1
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        @Override // defpackage.vn1
        public final int getValue() {
            return this.value;
        }
    }

    public static vn1 f(a aVar, List list, int i6) {
        Object next;
        Object next2;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((vn1) next).getValue() == i6) {
                break;
            }
        }
        vn1 vn1Var = (vn1) next;
        if (vn1Var != null) {
            return vn1Var;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((vn1) next2).getValue() == aVar.c()) {
                break;
            }
        }
        vn1 vn1Var2 = (vn1) next2;
        if (vn1Var2 != null) {
            return vn1Var2;
        }
        ja.k(defpackage.l5.m("No fallback bucket found for '", aVar.name(), "'"));
        return null;
    }

    @Override // defpackage.k2
    public final ArrayList a() {
        List<a> listD = d();
        ArrayList<a> arrayList = new ArrayList();
        for (Object obj : listD) {
            if (z92.E1(this.c.keySet()).contains(((a) obj).name())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        for (a aVar : arrayList) {
            arrayList2.add(f(aVar, c(aVar), e(aVar)));
        }
        return arrayList2;
    }

    @Override // defpackage.k2
    public final List<vn1<a>> c(ybf ybfVar) {
        ybfVar.getClass();
        if (ybfVar == a.a) {
            return ut0.E0(m.values());
        }
        if (ybfVar == a.b) {
            return ut0.E0(e3.values());
        }
        if (ybfVar == a.c) {
            return ut0.E0(i0.values());
        }
        if (ybfVar == a.d) {
            return ut0.E0(h0.values());
        }
        if (ybfVar == a.e) {
            return ut0.E0(n0.values());
        }
        if (ybfVar == a.f) {
            return ut0.E0(d0.values());
        }
        if (ybfVar == a.V) {
            return ut0.E0(e0.values());
        }
        if (ybfVar == a.W) {
            return ut0.E0(h3.values());
        }
        if (ybfVar == a.X) {
            return ut0.E0(g3.values());
        }
        if (ybfVar == a.Y) {
            return ut0.E0(n3.values());
        }
        if (ybfVar == a.Z) {
            return ut0.E0(q3.values());
        }
        if (ybfVar == a.a0) {
            return ut0.E0(p3.values());
        }
        if (ybfVar == a.b0) {
            return ut0.E0(k3.values());
        }
        if (ybfVar == a.c0) {
            return ut0.E0(l3.values());
        }
        if (ybfVar == a.d0) {
            return ut0.E0(r3.values());
        }
        if (ybfVar == a.e0) {
            return ut0.E0(s3.values());
        }
        if (ybfVar == a.f0) {
            return ut0.E0(m3.values());
        }
        if (ybfVar == a.g0) {
            return ut0.E0(y.values());
        }
        if (ybfVar == a.h0) {
            return ut0.E0(b0.values());
        }
        if (ybfVar == a.i0) {
            return ut0.E0(s2.values());
        }
        if (ybfVar == a.j0) {
            return ut0.E0(c1.values());
        }
        if (ybfVar == a.k0) {
            return ut0.E0(i1.values());
        }
        if (ybfVar == a.l0) {
            return ut0.E0(b2.values());
        }
        if (ybfVar == a.m0) {
            return ut0.E0(d5.values());
        }
        if (ybfVar == a.n0) {
            return ut0.E0(w0.values());
        }
        if (ybfVar == a.o0) {
            return ut0.E0(z0.values());
        }
        if (ybfVar == a.p0) {
            return ut0.E0(x0.values());
        }
        if (ybfVar == a.q0) {
            return ut0.E0(y1.values());
        }
        if (ybfVar == a.r0) {
            return ut0.E0(x1.values());
        }
        if (ybfVar == a.s0) {
            return ut0.E0(n2.values());
        }
        if (ybfVar == a.t0) {
            return ut0.E0(b4.values());
        }
        if (ybfVar == a.u0) {
            return ut0.E0(k0.values());
        }
        if (ybfVar == a.v0) {
            return ut0.E0(l1.values());
        }
        if (ybfVar == a.w0) {
            return ut0.E0(t2.values());
        }
        if (ybfVar == a.x0) {
            return ut0.E0(m0.values());
        }
        if (ybfVar == a.y0) {
            return ut0.E0(r1.values());
        }
        if (ybfVar == a.z0) {
            return ut0.E0(v2.values());
        }
        if (ybfVar == a.A0) {
            return ut0.E0(a0.values());
        }
        if (ybfVar == a.B0) {
            return ut0.E0(o2.values());
        }
        if (ybfVar == a.C0) {
            return ut0.E0(j1.values());
        }
        if (ybfVar == a.D0) {
            return ut0.E0(i3.values());
        }
        if (ybfVar == a.E0) {
            return ut0.E0(r2.values());
        }
        if (ybfVar == a.F0) {
            return ut0.E0(u2.values());
        }
        if (ybfVar == a.G0) {
            return ut0.E0(f1.values());
        }
        if (ybfVar == a.H0) {
            return ut0.E0(m1.values());
        }
        if (ybfVar == a.I0) {
            return ut0.E0(j.values());
        }
        if (ybfVar == a.J0) {
            return ut0.E0(v3.values());
        }
        if (ybfVar == a.K0) {
            return ut0.E0(w3.values());
        }
        if (ybfVar == a.L0) {
            return ut0.E0(k5.values());
        }
        if (ybfVar == a.M0) {
            return ut0.E0(l5.values());
        }
        if (ybfVar == a.N0) {
            return ut0.E0(i5.values());
        }
        if (ybfVar == a.O0) {
            return ut0.E0(j5.values());
        }
        if (ybfVar == a.P0) {
            return ut0.E0(n.values());
        }
        if (ybfVar == a.Q0) {
            return ut0.E0(o.values());
        }
        if (ybfVar == a.R0) {
            return ut0.E0(d3.values());
        }
        if (ybfVar == a.S0) {
            return ut0.E0(h1.values());
        }
        if (ybfVar == a.T0) {
            return ut0.E0(p2.values());
        }
        if (ybfVar == a.U0) {
            return ut0.E0(t0.values());
        }
        if (ybfVar == a.V0) {
            return ut0.E0(o0.values());
        }
        if (ybfVar == a.W0) {
            return ut0.E0(r0.values());
        }
        if (ybfVar == a.X0) {
            return ut0.E0(p0.values());
        }
        if (ybfVar == a.Y0) {
            return ut0.E0(u0.values());
        }
        if (ybfVar == a.Z0) {
            return ut0.E0(q0.values());
        }
        if (ybfVar == a.a1) {
            return ut0.E0(c5.values());
        }
        if (ybfVar == a.b1) {
            return ut0.E0(u3.values());
        }
        if (ybfVar == a.c1) {
            return ut0.E0(t1.values());
        }
        if (ybfVar == a.d1) {
            return ut0.E0(q2.values());
        }
        if (ybfVar == a.e1) {
            return ut0.E0(d1.values());
        }
        if (ybfVar == a.f1) {
            return ut0.E0(o1.values());
        }
        if (ybfVar == a.g1) {
            return ut0.E0(q1.values());
        }
        if (ybfVar == a.h1) {
            return ut0.E0(p1.values());
        }
        if (ybfVar == a.i1) {
            return ut0.E0(g5.values());
        }
        if (ybfVar == a.j1) {
            return ut0.E0(e5.values());
        }
        if (ybfVar == a.k1) {
            return ut0.E0(h5.values());
        }
        if (ybfVar == a.l1) {
            return ut0.E0(z2.values());
        }
        if (ybfVar == a.m1) {
            return ut0.E0(f5.values());
        }
        if (ybfVar == a.n1) {
            return ut0.E0(u.values());
        }
        if (ybfVar == a.o1) {
            return ut0.E0(f.values());
        }
        if (ybfVar == a.p1) {
            return ut0.E0(s.values());
        }
        if (ybfVar == a.q1) {
            return ut0.E0(r.values());
        }
        if (ybfVar == a.r1) {
            return ut0.E0(y2.values());
        }
        if (ybfVar == a.s1) {
            return ut0.E0(a3.values());
        }
        if (ybfVar == a.t1) {
            return ut0.E0(g1.values());
        }
        if (ybfVar == a.u1) {
            return ut0.E0(x2.values());
        }
        if (ybfVar == a.v1) {
            return ut0.E0(k1.values());
        }
        if (ybfVar == a.w1) {
            return ut0.E0(y0.values());
        }
        if (ybfVar == a.x1) {
            return ut0.E0(t.values());
        }
        if (ybfVar == a.y1) {
            return ut0.E0(v.values());
        }
        if (ybfVar == a.z1) {
            return ut0.E0(c0.values());
        }
        if (ybfVar == a.A1) {
            return ut0.E0(h.values());
        }
        if (ybfVar == a.B1) {
            return ut0.E0(b1.values());
        }
        if (ybfVar == a.C1) {
            return ut0.E0(l0.values());
        }
        if (ybfVar == a.D1) {
            return ut0.E0(d2.values());
        }
        if (ybfVar == a.E1) {
            return ut0.E0(l2.values());
        }
        if (ybfVar == a.F1) {
            return ut0.E0(k2.values());
        }
        if (ybfVar == a.G1) {
            return ut0.E0(j2.values());
        }
        if (ybfVar == a.H1) {
            return ut0.E0(c2.values());
        }
        if (ybfVar == a.I1) {
            return ut0.E0(h2.values());
        }
        if (ybfVar == a.J1) {
            return ut0.E0(e2.values());
        }
        if (ybfVar == a.K1) {
            return ut0.E0(c4.values());
        }
        if (ybfVar == a.L1) {
            return ut0.E0(d4.values());
        }
        if (ybfVar == a.M1) {
            return ut0.E0(v0.values());
        }
        if (ybfVar == a.N1) {
            return ut0.E0(y4.values());
        }
        if (ybfVar == a.O1) {
            return ut0.E0(u1.values());
        }
        if (ybfVar == a.P1) {
            return ut0.E0(v1.values());
        }
        if (ybfVar == a.Q1) {
            return ut0.E0(a5.values());
        }
        if (ybfVar == a.R1) {
            return ut0.E0(g0.values());
        }
        if (ybfVar == a.S1) {
            return ut0.E0(n1.values());
        }
        if (ybfVar == a.T1) {
            return ut0.E0(w.values());
        }
        if (ybfVar == a.U1) {
            return ut0.E0(s0.values());
        }
        if (ybfVar == a.V1) {
            return ut0.E0(a1.values());
        }
        if (ybfVar == a.W1) {
            return ut0.E0(e1.values());
        }
        if (ybfVar == a.X1) {
            return ut0.E0(w2.values());
        }
        if (ybfVar == a.Y1) {
            return ut0.E0(a2.values());
        }
        if (ybfVar == a.Z1) {
            return ut0.E0(z1.values());
        }
        if (ybfVar == a.a2) {
            return ut0.E0(w1.values());
        }
        if (ybfVar == a.b2) {
            return ut0.E0(t3.values());
        }
        if (ybfVar == a.c2) {
            return ut0.E0(j3.values());
        }
        if (ybfVar == a.d2) {
            return ut0.E0(m2.values());
        }
        if (ybfVar == a.e2) {
            return ut0.E0(l.values());
        }
        if (ybfVar == a.f2) {
            return ut0.E0(f3.values());
        }
        if (ybfVar == a.g2) {
            return ut0.E0(b.values());
        }
        if (ybfVar == a.h2) {
            return ut0.E0(c.values());
        }
        if (ybfVar == a.i2) {
            return ut0.E0(k.values());
        }
        if (ybfVar == a.j2) {
            return ut0.E0(s1.values());
        }
        if (ybfVar == a.k2) {
            return ut0.E0(o3.values());
        }
        if (ybfVar == a.l2) {
            return ut0.E0(z4.values());
        }
        if (ybfVar == a.m2) {
            return ut0.E0(f4.values());
        }
        if (ybfVar == a.n2) {
            return ut0.E0(a4.values());
        }
        if (ybfVar == a.o2) {
            return ut0.E0(j0.values());
        }
        if (ybfVar == a.p2) {
            return ut0.E0(y3.values());
        }
        if (ybfVar == a.q2) {
            return ut0.E0(x3.values());
        }
        if (ybfVar == a.r2) {
            return ut0.E0(d.values());
        }
        if (ybfVar == a.s2) {
            return ut0.E0(e.values());
        }
        if (ybfVar == a.t2) {
            return ut0.E0(g.values());
        }
        if (ybfVar == a.u2) {
            return ut0.E0(p.values());
        }
        if (ybfVar == a.v2) {
            return ut0.E0(b3.values());
        }
        if (ybfVar == a.w2) {
            return ut0.E0(x.values());
        }
        if (ybfVar == a.x2) {
            return ut0.E0(g4.values());
        }
        if (ybfVar == a.y2) {
            return ut0.E0(h4.values());
        }
        if (ybfVar == a.z2) {
            return ut0.E0(i4.values());
        }
        if (ybfVar == a.A2) {
            return ut0.E0(f0.values());
        }
        if (ybfVar == a.B2) {
            return ut0.E0(z3.values());
        }
        if (ybfVar == a.C2) {
            return ut0.E0(i.values());
        }
        if (ybfVar == a.D2) {
            return ut0.E0(q.values());
        }
        if (ybfVar == a.E2) {
            return ut0.E0(e4.values());
        }
        if (ybfVar == a.F2) {
            return ut0.E0(f2.values());
        }
        if (ybfVar == a.G2) {
            return ut0.E0(b5.values());
        }
        if (ybfVar == a.H2) {
            return ut0.E0(i2.values());
        }
        if (ybfVar == a.I2) {
            return ut0.E0(c3.values());
        }
        if (ybfVar == a.J2) {
            return ut0.E0(j4.values());
        }
        if (ybfVar == a.K2) {
            return ut0.E0(k4.values());
        }
        if (ybfVar == a.L2) {
            return ut0.E0(l4.values());
        }
        if (ybfVar == a.M2) {
            return ut0.E0(m4.values());
        }
        if (ybfVar == a.N2) {
            return ut0.E0(n4.values());
        }
        if (ybfVar == a.O2) {
            return ut0.E0(r4.values());
        }
        if (ybfVar == a.P2) {
            return ut0.E0(s4.values());
        }
        if (ybfVar == a.Q2) {
            return ut0.E0(u4.values());
        }
        if (ybfVar == a.R2) {
            return ut0.E0(v4.values());
        }
        if (ybfVar == a.S2) {
            return ut0.E0(x4.values());
        }
        if (ybfVar == a.T2) {
            return ut0.E0(g2.values());
        }
        if (ybfVar == a.U2) {
            return ut0.E0(o4.values());
        }
        if (ybfVar == a.V2) {
            return ut0.E0(q4.values());
        }
        if (ybfVar == a.W2) {
            return ut0.E0(t4.values());
        }
        if (ybfVar == a.X2) {
            return ut0.E0(p4.values());
        }
        if (ybfVar == a.Y2) {
            return ut0.E0(w4.values());
        }
        if (ybfVar == a.Z2) {
            return ut0.E0(z.values());
        }
        akb.o(ybfVar, "Unknown test ");
        return null;
    }

    @Override // defpackage.k2
    public final List<a> d() {
        return u63.a0(a.a, a.b, a.c, a.d, a.e, a.f, a.V, a.W, a.X, a.Y, a.Z, a.a0, a.b0, a.c0, a.d0, a.e0, a.f0, a.g0, a.h0, a.i0, a.j0, a.k0, a.l0, a.m0, a.n0, a.o0, a.p0, a.q0, a.r0, a.s0, a.t0, a.u0, a.v0, a.w0, a.x0, a.y0, a.z0, a.A0, a.B0, a.C0, a.D0, a.E0, a.F0, a.G0, a.H0, a.I0, a.J0, a.K0, a.L0, a.M0, a.N0, a.O0, a.P0, a.Q0, a.R0, a.S0, a.T0, a.U0, a.V0, a.W0, a.X0, a.Y0, a.Z0, a.a1, a.b1, a.c1, a.d1, a.e1, a.f1, a.g1, a.h1, a.i1, a.j1, a.k1, a.l1, a.m1, a.n1, a.o1, a.p1, a.q1, a.r1, a.s1, a.t1, a.u1, a.v1, a.w1, a.x1, a.y1, a.z1, a.A1, a.B1, a.C1, a.D1, a.E1, a.F1, a.G1, a.H1, a.I1, a.J1, a.K1, a.L1, a.M1, a.N1, a.O1, a.P1, a.Q1, a.R1, a.S1, a.T1, a.U1, a.V1, a.W1, a.X1, a.Y1, a.Z1, a.a2, a.b2, a.c2, a.d2, a.e2, a.f2, a.g2, a.h2, a.i2, a.j2, a.k2, a.l2, a.m2, a.n2, a.o2, a.p2, a.q2, a.r2, a.s2, a.t2, a.u2, a.v2, a.w2, a.x2, a.y2, a.z2, a.A2, a.B2, a.C2, a.D2, a.E2, a.F2, a.G2, a.H2, a.I2, a.J2, a.K2, a.L2, a.M2, a.N2, a.O2, a.P2, a.Q2, a.R2, a.S2, a.T2, a.U2, a.V2, a.W2, a.X2, a.Y2, a.Z2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a implements ybf {
        public static final a A0;
        public static final a A1;
        public static final a A2;
        public static final a B0;
        public static final a B1;
        public static final a B2;
        public static final a C0;
        public static final a C1;
        public static final a C2;
        public static final a D0;
        public static final a D1;
        public static final a D2;
        public static final a E0;
        public static final a E1;
        public static final a E2;
        public static final a F0;
        public static final a F1;
        public static final a F2;
        public static final a G0;
        public static final a G1;
        public static final a G2;
        public static final a H0;
        public static final a H1;
        public static final a H2;
        public static final a I0;
        public static final a I1;
        public static final a I2;
        public static final a J0;
        public static final a J1;
        public static final a J2;
        public static final a K0;
        public static final a K1;
        public static final a K2;
        public static final a L0;
        public static final a L1;
        public static final a L2;
        public static final a M0;
        public static final a M1;
        public static final a M2;
        public static final a N0;
        public static final a N1;
        public static final a N2;
        public static final a O0;
        public static final a O1;
        public static final a O2;
        public static final a P0;
        public static final a P1;
        public static final a P2;
        public static final a Q0;
        public static final a Q1;
        public static final a Q2;
        public static final a R0;
        public static final a R1;
        public static final a R2;
        public static final a S0;
        public static final a S1;
        public static final a S2;
        public static final a T0;
        public static final a T1;
        public static final a T2;
        public static final a U0;
        public static final a U1;
        public static final a U2;
        public static final a V;
        public static final a V0;
        public static final a V1;
        public static final a V2;
        public static final a W;
        public static final a W0;
        public static final a W1;
        public static final a W2;
        public static final a X;
        public static final a X0;
        public static final a X1;
        public static final a X2;
        public static final a Y;
        public static final a Y0;
        public static final a Y1;
        public static final a Y2;
        public static final a Z;
        public static final a Z0;
        public static final a Z1;
        public static final a Z2;
        public static final a a;
        public static final a a0;
        public static final a a1;
        public static final a a2;
        public static final /* synthetic */ a[] a3;
        public static final a b;
        public static final a b0;
        public static final a b1;
        public static final a b2;
        public static final a c;
        public static final a c0;
        public static final a c1;
        public static final a c2;
        public static final a d;
        public static final a d0;
        public static final a d1;
        public static final a d2;
        public static final a e;
        public static final a e0;
        public static final a e1;
        public static final a e2;
        public static final a f;
        public static final a f0;
        public static final a f1;
        public static final a f2;
        public static final a g0;
        public static final a g1;
        public static final a g2;
        public static final a h0;
        public static final a h1;
        public static final a h2;
        public static final a i0;
        public static final a i1;
        public static final a i2;
        public static final a j0;
        public static final a j1;
        public static final a j2;
        public static final a k0;
        public static final a k1;
        public static final a k2;
        public static final a l0;
        public static final a l1;
        public static final a l2;
        public static final a m0;
        public static final a m1;
        public static final a m2;
        public static final a n0;
        public static final a n1;
        public static final a n2;
        public static final a o0;
        public static final a o1;
        public static final a o2;
        public static final a p0;
        public static final a p1;
        public static final a p2;
        public static final a q0;
        public static final a q1;
        public static final a q2;
        public static final a r0;
        public static final a r1;
        public static final a r2;
        public static final a s0;
        public static final a s1;
        public static final a s2;
        public static final a t0;
        public static final a t1;
        public static final a t2;
        public static final a u0;
        public static final a u1;
        public static final a u2;
        public static final a v0;
        public static final a v1;
        public static final a v2;
        public static final a w0;
        public static final a w1;
        public static final a w2;
        public static final a x0;
        public static final a x1;
        public static final a x2;
        public static final a y0;
        public static final a y1;
        public static final a y2;
        public static final a z0;
        public static final a z1;
        public static final a z2;
        private final String description;
        private final int fallbackValue;
        private final PayloadSpecification payload;

        static {
            PayloadSpecification.a aVar = PayloadSpecification.a.c;
            a = new a("cmi_jp_app_ui_tst", 0, -1, "MOBILE-25268: Add cmi_jp_app_ui_tst", new PayloadSpecification(aVar));
            int i = 4;
            int i3 = -1;
            b = new a(1, i3, i, "jpmp_jsig_onboarding_redirect_tst", "CHALLENGET-3622: create jpmp_jsig_onboarding_redirect_tst for gating redirection to JSO in JP App");
            int i4 = 4;
            int i5 = -1;
            c = new a(2, i5, i4, "droid_fake_tst", "DROID-2174: Add dummy droid_fake_tst");
            d = new a(3, i3, i, "droid_fake_alternative_tst", "DROID-7213: Add alternative dummy droid_fake_alternative_tst");
            e = new a(4, i5, i4, "droid_ip_country_prompt_v3_tst", "DROID-5904: IP Country Prompt Test");
            f = new a(5, i3, i, "droid_datadog_monitoring_tst", "DROID-3776 Create a new proctor test to gate datadog monitoring");
            V = new a(6, i5, i4, "droid_datadog_rum_parent", "TODO");
            W = new a(7, i3, i, "jsj_crowtaxo_holdout_tst", "DISCO-2779: Holdout test for crowtaxo");
            PayloadSpecification.a aVar2 = PayloadSpecification.a.d;
            X = new a("jsj_crowtaxo_frontend_tst", 8, -1, "DISCO-2780: shared test for crowtaxo frontend", new PayloadSpecification(aVar2));
            int i6 = 4;
            int i7 = -1;
            Y = new a(9, i7, i6, "jso_jobtype_tst", "JSO-417: Add employment type question to onboarding flow");
            int i8 = 10;
            int i9 = -1;
            Z = new a(i8, i9, 4, "jso_rn_onboarding_tst", "JSO-2076: Proctor for gating the react native for both iOS and Android");
            a0 = new a(11, i7, i6, "jso_remove_recent_job_tst", "JSO-2564: Tests removing the recent_job page altogether");
            b0 = new a("jso_crowtaxo_m3_tst", 12, -1, "JSO-1977: payload-based test to control functionality of milestone 3 onboarding functionality", new PayloadSpecification(aVar2));
            c0 = new a("jso_crowtaxo_questions_per_page_tst", 13, -1, "JSO-2499: Limit number of OQVT questions per onboarding page", new PayloadSpecification(PayloadSpecification.a.a));
            int i10 = 4;
            int i11 = -1;
            d0 = new a(14, i11, i10, "jso_separate_remote_screen_tst", "DROID-9447: Add jso_separate_remote_screen_tst to Droid Proctor groups");
            int i12 = 4;
            int i13 = -1;
            e0 = new a(15, i13, i12, "jso_skip_flow_udp_timestamp_tst", "JSO-2352: Proctor test for JS onboarding making users skip onboarding per udp timestamp");
            f0 = new a(16, i11, i10, "jso_generalist_by_default_tst", "JSO-2869: Test making the flow generalist by default");
            g0 = new a(17, i13, i12, "droid_af_preload_attribution_tst", "DROID-4868: Add tst to enable preload campaign attribution in Appsflyer");
            h0 = new a(18, i11, i10, "droid_appupgrade_tst", "DROID-4859: Create droid_appupgrade_tst");
            i0 = new a("droid_tos_updated_banner_tog", 19, -1, "DROID-5577: Long running proctor group for annual 'Terms of Service' updates", new PayloadSpecification(PayloadSpecification.a.b));
            j0 = new a(20, i11, i10, "droid_native_myjobs", "DROID-5496: Create proctor android native my jobs");
            int i14 = 4;
            int i15 = -1;
            k0 = new a(21, i15, i14, "droid_native_myjobs_nonia", "MAGUA-956: Create proctor android native my jobs");
            l0 = new a(22, i11, i10, "droid_rn_myjobs_tst", "DROID-10436: Create proctor for React Native MyJobs");
            m0 = new a(23, i15, i14, "rn_myjobs_invitations_tst", "MYJOBS-825: Mj1.2 employer Invitations");
            n0 = new a(24, i11, i10, "droid_native_messaging", "MAGE-885: [DROID] Native Messaging");
            o0 = new a(25, i15, i14, "droid_native_messaging_sse", "MAGE-1340: Experiment of SSE");
            p0 = new a(26, i11, i10, "droid_native_messaging_pajim", "MAGE-1794: Add toggle for PAJIM in native messaging");
            q0 = new a(27, i15, i14, "droid_rn_messaging", "MEGA-75: RN Messaging Migration");
            r0 = new a(28, i11, i10, "droid_rich_profile_tst", "JSMA-2094: Android native profile");
            s0 = new a(29, i15, i14, "droid_rn_viewjob", "WENG-470: [RNVJ] (Android) Replace VJ webview with RN view");
            t0 = new a(30, i11, i10, "mob_vj_secondary_actions_prominence", "DISCO-1394: Decrease prominence of secondary actions on View Job");
            u0 = new a(31, i15, i14, "droid_googlesignin_migration_test", "DROID-6098: New proctor test for Google SignIn using CredentialManager API");
            v0 = new a(32, i11, i10, "droid_native_myjobs_suggest_hires", "MAGUA-1212: Create proctor for suggest hires in native my jobs");
            w0 = new a(33, i15, i14, "droid_uip_messaging_tst", "DROID-0000: No-harm test for the Account Status Migration");
            x0 = new a(34, i11, i10, "droid_indeed_cookies_tst", "DROID-9108: No-harm test for Indeed Cookies migration");
            y0 = new a(35, i15, i14, "droid_recaptcha_logging_tst", "DROID-11059: Obtain and log recaptcha token before Indeed Apply");
            z0 = new a(36, i11, i10, "droid_web_serp_url_tst", "DROID-9374: Test for treating web SERP urls properly");
            A0 = new a(37, i15, i14, "droid_app_version_details_tst", "DROID-6299: Create app version details on hamburger menu");
            B0 = new a(38, i11, i10, "droid_save_continue_btn_tst", "DROID-6120: Create proctor for save and continue in native my jobs");
            C0 = new a(39, i15, i14, "droid_native_myjobs_primary_subtab_tst", "DROID-6865: Create proctor for primary tab view in native my jobs");
            D0 = new a(40, i11, i10, "jsj_ifl7_tst", "DROID-8154: Create proctor for migration to IFL 7 Theme / MADS 7");
            E0 = new a(41, i15, i14, "droid_sync_refresh_proctor", "DROID-7075: Controls whether or not we synchronously refresh proctor results after login from RegPromo or not.");
            F0 = new a(42, i11, i10, "droid_urlregistry_tst", "DROID-6784: No-harm test for URLRegistry API integration");
            G0 = new a(43, i15, i14, "droid_native_myjobs_for_pro", "DROID-7070: Create droid_native_myjobs_for_pro");
            H0 = new a(44, i11, i10, "droid_native_myjobs_top_choice_features", "PSUB-1381: Creating android native proctor to control top choice features on my jobs");
            I0 = new a(45, 1, i14, "app_population_allocations_droid", "JSMA-2586: Droid parent test for navigation. Handles distribution of the app population.");
            J0 = new a(46, i11, i10, "max_nav_logic_droid", "JSMA-2586: Child test for max nav allocation");
            int i16 = -1;
            K0 = new a(47, i16, i14, "max_tab_config_droid", "JSMA-2586: Child test for max allocation");
            L0 = new a(48, i11, i10, "stable_app_nav_logic_droid", "JSMA-2586: Child test for stable nav allocation");
            M0 = new a(49, i16, i14, "stable_app_tab_config_droid", " JSMA-2586: Child test for stable app allocation");
            N0 = new a(50, i11, i10, "shared_experimental_nav_logic_droid", "JSMA-2586: Child test for shared experimental allocation");
            O0 = new a(51, i16, i14, "shared_experimental_tab_config_droid", "JSMA-2586: Child test for shared experimental app allocation");
            P0 = new a(52, i11, i10, "companion_nav_logic_droid", "JSMA-2586: Child test for companion nav allocation");
            Q0 = new a(53, i16, i14, "companion_tab_config_droid", " JSMA-2586: Child test for companion allocation");
            R0 = new a(54, i11, i10, "jpmjse_app_login_explainer_android_tst", "DROID-9362: New JP initial login screen (RegPromo) experiment");
            S0 = new a(55, i16, i14, "droid_native_myjobs_mads", "MAGUA-1773: Create proctor for Android my jobs MADS");
            T0 = new a(56, i11, i10, "droid_search_overlay_native_tst", "DROID-7125: Add Proctor test for controlling native experience of Droid search overlay");
            U0 = new a(57, i16, i14, "droid_native_coworker", "DROID-7587: Create proctor test for Ace Android");
            V0 = new a(58, i11, i10, "droid_keyboard_visibility_tst", "DROID-6749: Hide bottom tabs when keyboard is visible");
            int i17 = 59;
            W0 = new a(i17, i16, 6, "droid_myjobs_shared_hire_tst", (String) null);
            X0 = new a(60, i11, i10, "droid_mag_ftue_new_logged_out_experience_tst", "DROID-10698: Enable new logged out experience");
            int i18 = 4;
            Y0 = new a(61, i16, i18, "droid_native_magua_screenshot_share_tst", "MAGUA-1908: Android: Adding a “Share” option when a user taking screenshots on VJP in the app");
            Z0 = new a(62, i11, i10, "droid_magua_share_tooltip_tst", "MAGUA-1934: Android: VJ Sharing Improvement (tooltip)");
            a1 = new a(63, i16, i18, "rn_magua_share_tooltip_tst", "MAGUA-1934: Android: VJ Sharing Improvement (tooltip)");
            b1 = new a(64, i11, i10, "magua_job_feedback_prompt_tst", "MAGUA-2103: Collecting feedback from users coming to Indeed from a shared job link");
            c1 = new a("droid_rich_profile_datadog_rum_tst", 65, -1, "DROID-8350 Proctor test for Datadog RUM(Real User Monitoring) in Native Profile feature", new PayloadSpecification(aVar));
            d1 = new a(66, i11, i10, "droid_snowplow_tst", "DROID-7262: Snowplow");
            int i19 = 67;
            int i20 = -1;
            e1 = new a(i19, i20, 4, "droid_native_myjobs_buttons_api_migration", "DROID-8423:  Proctor test for button rest api graphql migration");
            int i21 = 4;
            int i22 = -1;
            f1 = new a(68, i22, i21, "droid_native_profile_work_areas_tst", "DROID-8442: Android Native Toggle for Work Areas");
            g1 = new a("droid_onboarding_title_match_autocomplete_dataset_tst", 69, -1, "TITLE-948: Create droid_onboarding_title_match_autocomplete_dataset_tst", new PayloadSpecification(aVar2));
            int i23 = 70;
            h1 = new a(i23, i20, 4, "droid_native_profile_work_wellbeing_tst", "DROID-8562: Create Proctor for Work Wellbeing");
            i1 = new a(71, i22, i21, "rnhp_parent_test", "RNHP-128: React Native Homepage Parent Test");
            int i24 = 72;
            int i25 = -1;
            j1 = new a(i24, i25, 4, "rnhp_expanded_location_modal_tst", "DISCO-4455: Create rnhp_expanded_location_modal_tst");
            int i26 = 73;
            int i27 = -1;
            k1 = new a(i26, i27, 4, "rnhp_vj", "RNHP-809: Create proctor rnhp_vj");
            l1 = new a("hp_job_sections_tst", 74, -1, "DISCO-2180: Create hp_job_sections_tst for sectioned jobfeed experience", new PayloadSpecification(aVar2));
            int i28 = 75;
            int i29 = -1;
            m1 = new a(i28, i29, 4, "rnhp_nav_refresh_tst", "RNHP-366: RNHP Navigation Refresh");
            int i30 = 76;
            int i31 = -1;
            n1 = new a(i30, i31, 4, "droid_ace_interview_prep", "DROID-8741: ACE Interview Prep Feature (Android)");
            int i32 = 4;
            int i33 = -1;
            o1 = new a(77, i33, i32, "ace_interview_prep_career_scout_tst", "AICE-277: ACE Interview Prep integration with Career Scout");
            int i34 = 78;
            int i35 = -1;
            p1 = new a(i34, i35, 4, "cs_interview_prep_text_mode_tst", "AICE-2523: Allow jobseekers to start a text version of mock interview");
            q1 = new a("cs_interview_prep_kill_switch_tog", 79, -1, "AICE-3008: Maintenance mode/kill switch to be used when the feature is degraded or unavailable", new PayloadSpecification(aVar2));
            r1 = new a(80, i33, i32, "flash_feedback_interview_prep_tst", "AICE-1349: Collect Flash Feedback Between Interview and Summary Page");
            int i36 = 81;
            int i37 = -1;
            s1 = new a(i36, i37, 4, "interview_prep_feedback_priority_tag_tst", "AICE-2561: Optimize Visibility of Question-by-Question Feedback");
            int i38 = 82;
            int i39 = -1;
            t1 = new a(i38, i39, 4, "droid_native_myjobs_ghosted_application_signals_tst", "MAGUA-2191: Create proctor for ghosted application signals ");
            u1 = new a(83, i33, i32, "eba_myjobs_android_toggle", "DROID-8058: Integrate proctor for Android EBA my jobs");
            int i40 = 84;
            int i41 = -1;
            v1 = new a(i40, i41, 4, "droid_native_myjobs_red_dot_tst", "DROID-8672: create a new proctor for red dot status label in native myjobs");
            int i42 = 85;
            int i43 = -1;
            w1 = new a(i42, i43, 4, "droid_native_messaging_responsiveness", "MAGE-1847");
            x1 = new a(86, i33, i32, "droid_ace_education_experience", "DROID-9440: Create career scout education experience proctor toggle");
            int i44 = 87;
            int i45 = -1;
            y1 = new a(i44, i45, 4, "droid_ace_interview_scheduling", "JSMA-3147: Show Interview Cards in CS chat");
            int i46 = 88;
            int i47 = -1;
            z1 = new a(i46, i47, 4, "droid_avro_logging_tst", "DROID-8895: Create Proctor toggle for Avro logging implementation");
            A1 = new a("ace_interview_prep_payload_tog", 89, -1, "AICE-1159: Create ace_interview_prep_payload_tog proctor to control the payload for interview prep screens", new PayloadSpecification(aVar2));
            int i48 = 90;
            int i49 = -1;
            B1 = new a(i48, i49, 4, "droid_native_myjobs_better_sorting_tst", "MAGUA-2371: Create proctor for Better sorting of applications in myjobs");
            int i50 = 91;
            int i51 = -1;
            C1 = new a(i50, i51, 4, "droid_homepage_ready_tst", "DROID-9111: move emitting homePageReady metric to JSMA Bridge event");
            int i52 = 4;
            int i53 = -1;
            D1 = new a(92, i53, i52, "droid_rn_profile", "PROFEXP-785: Toggle All Profile React Native Features ");
            int i54 = 93;
            int i55 = -1;
            E1 = new a(i54, i55, 4, "droid_rn_profile_resume", "RN-801: Create separate proctor tests to toggle native versions of preferences and resume tabs");
            int i56 = 94;
            int i57 = -1;
            F1 = new a(i56, i57, 4, "droid_rn_profile_photos", "RN-265: Create Android and iOS RN Photos Proctor tests");
            G1 = new a(95, i53, i52, "droid_rn_profile_form_summary_tst", "DROID-10878: [DROID] Summary Form - Proctor Flag & Native Routing");
            int i58 = 96;
            int i59 = -1;
            H1 = new a(i58, i59, 4, "droid_rn_profile_additional_information_tst", "DROID-10970: Additional Information Form - Proctor Flag & Native Routing");
            int i60 = 97;
            int i61 = -1;
            I1 = new a(i60, i61, 4, "droid_rn_profile_form_patent_tst", "DROID-10962: [DROID] Patents - Proctor Flag & Native Routing");
            J1 = new a(98, i53, i52, "droid_rn_profile_form_award_tst", "DROID-10971: [DROID] Awards - Proctor Flag & Native Routing ");
            int i62 = 99;
            int i63 = -1;
            K1 = new a(i62, i63, 4, "myjobs_include_gd_applications_tog", "DROID-9290: Create proctor for apply time format");
            int i64 = 100;
            int i65 = -1;
            L1 = new a(i64, i65, 4, "myjobs_nexus_ai_recruiter_tog", "Gates the Nexus (AI Recruiter) workflow feature in MyJobs applied tab.");
            M1 = new a(101, i53, i52, "droid_native_messaging_ai_assistant", "DROID-9233: AI-assisted messaging Android test");
            int i66 = 102;
            int i67 = -1;
            N1 = new a(i66, i67, 4, "prof_tabbed_exp_resume_data_import", "PROFEXP-503: Proctor to enable Resume Data Import functionality in POW for merged profile");
            int i68 = 103;
            int i69 = -1;
            O1 = new a(i68, i69, 4, "droid_rich_profile_resume_data_import", "DROID-9264: Add resume data import Android proctor");
            P1 = new a(104, i53, i52, "droid_rich_profile_skillsets", "DROID-9364: Add Skill Sets Proctor");
            int i70 = 105;
            int i71 = -1;
            Q1 = new a(i70, i71, 4, "rdp_pdf_resume_facelift", "POW-5995: RDP Resume PDF Facelift");
            int i72 = 106;
            int i73 = -1;
            R1 = new a(i72, i73, 4, "droid_expMj1_invited_in_myjobs", "DROID-9327: Create a proctor for invitation tab in native my jobs");
            S1 = new a(107, i53, i52, "droid_native_profile_online_status_tst", "DROID-9087: create droid_native_profile_online_status_tst");
            int i74 = 108;
            int i75 = -1;
            T1 = new a(i74, i75, 4, "droid_ace_resume_creation_tst", "DROID-9426: Add proctor for Ace Resume Creation");
            int i76 = 109;
            int i77 = -1;
            U1 = new a(i76, i77, 4, "droid_native_career_scout_interstitial_promo", "DROID-9355: Display interstitial about Career Scout (Ace) on app start-up");
            V1 = new a(110, i53, i52, "droid_native_myjobs_application_insights_tst", "MAGUA-2525: Create proctor for application insights in myjobs");
            int i78 = 111;
            int i79 = -1;
            W1 = new a(i78, i79, 4, "droid_native_myjobs_event_logging", "MAGUA-2011: Create proctor for logging in native myjobs");
            int i80 = 112;
            int i81 = -1;
            X1 = new a(i80, i81, 4, "droidnative_myjobs_next_steps_dashboard", "MAGUA-2641: MyJobs next steps dashboard: applications progress recap and actions reminder");
            Y1 = new a(113, i53, i52, "droid_rn_myjobs_next_steps_profile_actions_tst", "RN-2098: Show resume glow up as NBA on MyJobs (Android)");
            int i82 = 114;
            int i83 = -1;
            Z1 = new a(i82, i83, 4, "droid_rn_myjobs_nba_tst", "MYJOBS-1078: NBA Recommendation Dashboard UI revamp (Android). Depends on droid_rn_myjobs_tst >= phase_b_active (3).");
            int i84 = 115;
            int i85 = -1;
            a2 = new a(i84, i85, 4, "droid_rich_profile_special_licenses", "DROID-9406: Display special license sections (Nursing, Accounting, Driving)");
            b2 = new a(116, i53, i52, "jso_trigger_onboarding_serp_tst", "JSO-2969: trigger onboarding prompt from occupation-intent search");
            int i86 = 117;
            int i87 = -1;
            c2 = new a(i86, i87, 4, "jsj_pathfinder_retake_quiz_ux_tst", "AICE-1365 Pathfinder retake quiz UX test");
            int i88 = 118;
            int i89 = -1;
            d2 = new a(i88, i89, 4, "droid_rn_serp_tst", "JSMA-3349: JSMA React Native Serp");
            e2 = new a(119, i53, i52, "career_scout_fab", "JSMA-3278: Career Scout FAB");
            int i90 = 120;
            int i91 = -1;
            f2 = new a(i90, i91, 4, "js_mobile_coworker_async_suggestions", "JSCHAT-2263 Make suggestions async");
            int i92 = 121;
            int i93 = -1;
            g2 = new a(i92, i93, 4, "ace_career_scout_api_tst", "JSMA-3623: A/B test GraphQL vs Mastra backend");
            h2 = new a(122, i53, i52, "ace_enable_last_chat_on_hub", "RN-1990: Enable last chat session on Career Scout hub");
            int i94 = 123;
            int i95 = -1;
            i2 = new a(i94, i95, 4, "career_scout_always_aware", "AICE-2844: Investigate options for getting a view's context");
            int i96 = 124;
            int i97 = -1;
            j2 = new a(i96, i97, 4, "droid_regpromo_employer_link_out_tst", "DROID-9702: Employer Link on Mobile Login");
            k2 = new a(125, i53, i52, "jso_location_v2_collection_tst", "DROID-9338: Configure jso_location_v2_collection_tst proctor test");
            int i98 = 126;
            int i99 = -1;
            l2 = new a(i98, i99, 4, "profile_yoe_removal_tog", "PROFEXP-935: Toggle for YOE removal ");
            int i100 = 127;
            int i101 = -1;
            m2 = new a(i100, i101, 4, "pcs_qualifications_disclaimer", "POW-6462 - adding sourceability disclaimer to qualifications page in Profile");
            n2 = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, i53, i52, "meg_offsite_inline_push_primer", "OFFSITE-8: Inline push primer banner for notification center");
            int i102 = 129;
            int i103 = -1;
            o2 = new a(i102, i103, 4, "droid_ghostwriter_tst", "DROID-9934: Create Ghostwriter Proctor");
            int i104 = 130;
            int i105 = -1;
            p2 = new a(i104, i105, 4, "meg_accel_droid_push_opt_in_optim_experiments", "MEGA-39: [Android] Add proctor meg_accel_droid_push_opt_in_optim_experiments");
            q2 = new a(131, i53, i52, "meg_accel_droid_post_indeed_apply_primer", "MEGA-166: Proctor to show push primer for post-indeed-apply");
            r2 = new a("ace_interview_prep_bannar_myjobs_applied_tst", 132, -1, "PSUB-3474: Mock Interview promo on My Jobs Applied tab", new PayloadSpecification(aVar2));
            s2 = new a("ace_interview_prep_bannar_myjobs_interviews_tst", 133, -1, "PSUB-3474: Mock Interview promo on My Jobs Interviews tab", new PayloadSpecification(aVar2));
            t2 = new a(134, i53, i52, "ace_interview_prep_empty_state_cta_tog", "PSUB-3393: Set up Proctor toggle for empty state entry point");
            int i106 = 135;
            int i107 = -1;
            u2 = new a(i106, i107, 4, "cs_interview_prep_applied_jobcard_cta_tst", "AICE-2543: Create proctor test for Interview Prep CTA on Applied job cards");
            int i108 = 136;
            int i109 = -1;
            v2 = new a(i108, i109, 4, "interview_prep_interruption_tst", "AICE-2874: Test impact of user interruptions");
            w2 = new a("droid_ace_update_version_page", 137, -1, "JSMA-3924: Block users that are on unsupported app versions", new PayloadSpecification(aVar2));
            int i110 = 138;
            int i111 = -1;
            x2 = new a(i110, i111, 4, "prof_rdi_auto_merge_alert_tog", "PROFEXP-1096: Add new proctor to handle the auto-merge RDI alert display");
            int i112 = 139;
            int i113 = -1;
            y2 = new a(i112, i113, 4, "prof_rn_profile_form_certifications_tst", "RN-44: Certifications Form - Profile Tab Entry Point");
            int i114 = 140;
            int i115 = -1;
            z2 = new a(i114, i115, 4, "prof_rn_profile_form_education_tst", "RN-42: Education Form - React Native Implementation");
            int i116 = 141;
            int i117 = -1;
            A2 = new a(i116, i117, 4, "droid_enable_link_text_guard", "DROID-7626: [Feature] Messaging link handling");
            int i118 = 142;
            int i119 = -1;
            B2 = new a(i118, i119, 4, "meg_accel_push_primer_bottom_sheet_tst", "MEGA-14: Push primer bottom sheet test");
            int i120 = 143;
            int i121 = -1;
            C2 = new a(i120, i121, 4, "ai_messaging_mobile_version_two_improvements", "IOS-21049: Test new AI messaging UX iterations");
            int i122 = 144;
            int i123 = -1;
            D2 = new a(i122, i123, 4, "cs_interview_prep_flashcards_tst", "AICE-2209: Interview prep flashcards test");
            int i124 = 145;
            int i125 = -1;
            E2 = new a(i124, i125, 4, "pass_newwebview_post_tst", "PASS-22643: Create USER type proctor for Android mobile: pass_newwebview_post_tst");
            int i126 = 146;
            int i127 = -1;
            F2 = new a(i126, i127, 4, "droid_rn_profile_form_contact_info_tst", "DROID-10939: [DROID] Contact Information - NPUIP");
            int i128 = 147;
            int i129 = -1;
            G2 = new a(i128, i129, 4, "rn_ghostwriter_test", "RN-1218 Create a new Proctor rn_ghostwriter_test");
            int i130 = 148;
            int i131 = -1;
            H2 = new a(i130, i131, 4, "droid_rn_profile_form_publications_tst", "DROID-10965: [DROID] Publications - Proctor Flag & Native Routing");
            int i132 = 149;
            int i133 = -1;
            I2 = new a(i132, i133, 4, "jpm_updated_communication_policy_tog", "JSMA-4336: Toggle for showing secrecy of communications link in JP registration promo");
            int i134 = 150;
            int i135 = -1;
            J2 = new a(i134, i135, 4, "prof_rn_profile_form_groups_tst", "RN-442: Groups Form - Profile Tab Entry Point");
            int i136 = 151;
            int i137 = -1;
            K2 = new a(i136, i137, 4, "prof_rn_profile_form_languages_tst", "RN-51: Language Form - Profile tab entry point");
            int i138 = 152;
            int i139 = -1;
            L2 = new a(i138, i139, 4, "prof_rn_profile_form_links_tst", "RN-2222: Links Form - Profile Tab Entry Point");
            int i140 = 153;
            int i141 = -1;
            M2 = new a(i140, i141, 4, "prof_rn_profile_form_military_service_tst", "RN-452: Military Service Form - Profile Tab Entry Point");
            int i142 = 154;
            int i143 = -1;
            N2 = new a(i142, i143, 4, "prof_rn_profile_form_minimum_base_pay_tst", "RN-449: Minimum Base Pay Form - React Native Implementation");
            int i144 = 155;
            int i145 = -1;
            O2 = new a(i144, i145, 4, "prof_rn_profile_form_relocation_tst", "RN-458: Relocation Preferences Form - React Native Implementation");
            int i146 = 156;
            int i147 = -1;
            P2 = new a(i146, i147, 4, "prof_rn_profile_form_skills_tst", "RN-43: Skills Form - Profile Tab Entry Point");
            int i148 = 157;
            int i149 = -1;
            Q2 = new a(i148, i149, 4, "prof_rn_profile_form_work_experience_tst", "RN-1637: Work Experience Form - Profile Tab Entry Point");
            int i150 = 158;
            int i151 = -1;
            R2 = new a(i150, i151, 4, "prof_rn_profile_form_work_schedule_tst", "RN-446: Work Schedule Form - React Native Implementation");
            int i152 = 159;
            int i153 = -1;
            S2 = new a(i152, i153, 4, "prof_rn_sourcing_opt_in", "RN-1484: Create a proctor test for reusable sourcing opt-in component integration with profile");
            int i154 = 160;
            int i155 = -1;
            T2 = new a(i154, i155, 4, "droid_rn_profile_form_links_tst", "DROID-11189: [DROID] Links - Proctor Flag & Native Routing");
            int i156 = 161;
            int i157 = -1;
            U2 = new a(i156, i157, 4, "prof_rn_profile_form_preferred_commute_tst", "RN-461: Commute Form - React Native Implementation");
            int i158 = 162;
            int i159 = -1;
            V2 = new a(i158, i159, 4, "prof_rn_profile_form_preferred_job_types_tst", "RN-443: Preferred Job Types Form - React Native Implementation");
            int i160 = 163;
            int i161 = -1;
            W2 = new a(i160, i161, 4, "prof_rn_profile_form_work_areas_tst", "RN-464: Work Areas Form - React Native Implementation");
            int i162 = 164;
            int i163 = -1;
            X2 = new a(i162, i163, 4, "prof_rn_profile_form_preferred_job_titles_tst", "RN-455: Preferred Job Titles Form - React Native Implementation");
            int i164 = 165;
            int i165 = -1;
            Y2 = new a(i164, i165, 4, "prof_rn_profile_form_work_setting_tst", "RN-1942: Work Setting Form - React Native Implementation");
            int i166 = 166;
            int i167 = -1;
            Z2 = new a(i166, i167, 4, "droid_age_signals_tst", "DROID-11195: Introduce default off proctor test for age restriction logic");
            a[] aVarArrE = e();
            a3 = aVarArrE;
            ojh.k(aVarArrE);
        }

        public /* synthetic */ a(int i, int i3, int i4, String str, String str2) {
            this(str, i, i3, (i4 & 2) != 0 ? null : str2, (PayloadSpecification) null);
        }

        public static final /* synthetic */ a[] e() {
            return new a[]{a, b, c, d, e, f, V, W, X, Y, Z, a0, b0, c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, u0, v0, w0, x0, y0, z0, A0, B0, C0, D0, E0, F0, G0, H0, I0, J0, K0, L0, M0, N0, O0, P0, Q0, R0, S0, T0, U0, V0, W0, X0, Y0, Z0, a1, b1, c1, d1, e1, f1, g1, h1, i1, j1, k1, l1, m1, n1, o1, p1, q1, r1, s1, t1, u1, v1, w1, x1, y1, z1, A1, B1, C1, D1, E1, F1, G1, H1, I1, J1, K1, L1, M1, N1, O1, P1, Q1, R1, S1, T1, U1, V1, W1, X1, Y1, Z1, a2, b2, c2, d2, e2, f2, g2, h2, i2, j2, k2, l2, m2, n2, o2, p2, q2, r2, s2, t2, u2, v2, w2, x2, y2, z2, A2, B2, C2, D2, E2, F2, G2, H2, I2, J2, K2, L2, M2, N2, O2, P2, Q2, R2, S2, T2, U2, V2, W2, X2, Y2, Z2};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) a3.clone();
        }

        @Override // defpackage.ybf
        public final PayloadSpecification a() {
            return this.payload;
        }

        @Override // defpackage.ybf
        public final int c() {
            return this.fallbackValue;
        }

        @Override // defpackage.ybf
        public final String getDescription() {
            return this.description;
        }

        @Override // defpackage.ybf
        public final /* bridge */ /* synthetic */ String getName() {
            return name();
        }

        public a(String str, int i, int i3, String str2, PayloadSpecification payloadSpecification) {
            this.fallbackValue = i3;
            this.description = str2;
            this.payload = payloadSpecification;
        }
    }
}
