package defpackage;

import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface r86 extends u66 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.io.Serializable G(defpackage.r86 r17, defpackage.zh1 r18, defpackage.pu2 r19) {
        /*
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.l86
            if (r2 == 0) goto L17
            r2 = r1
            l86 r2 = (defpackage.l86) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            l86 r2 = new l86
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L38
            if (r3 != r4) goto L32
            java.lang.Object r0 = r2.L$1
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.lang.Object r0 = r2.L$0
            r86 r0 = (defpackage.r86) r0
            defpackage.r7d.b(r1)
            goto L51
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r5
        L38:
            defpackage.r7d.b(r1)
            m86 r1 = new m86
            r1.<init>(r0, r5)
            r2.L$0 = r5
            r2.L$1 = r5
            r2.label = r4
            r3 = r18
            java.lang.Object r1 = r0.r(r1, r3, r2)
            g13 r0 = defpackage.g13.a
            if (r1 != r0) goto L51
            return r0
        L51:
            wg0 r1 = (defpackage.wg0) r1
            java.lang.Object r0 = r1.b()
            m4b r0 = (defpackage.m4b) r0
            zr4 r15 = defpackage.zr4.a
            if (r0 == 0) goto Lc2
            java.util.List<l4b> r0 = r0.a
            if (r0 == 0) goto Lc2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.t92.r0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L72:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc0
            java.lang.Object r2 = r0.next()
            l4b r2 = (defpackage.l4b) r2
            r2.getClass()
            java.lang.String r3 = r2.a
            r4 = r3
            java.lang.String r3 = r2.c
            java.lang.String r6 = r2.f
            java.lang.String r5 = r2.e
            r7 = r4
            java.lang.String r4 = r2.d
            r8 = r7
            java.lang.String r7 = r2.h
            java.lang.String r2 = r2.g
            o09 r10 = new o09
            r9 = 2026(0x7ea, float:2.839E-42)
            r11 = 64
            r10.<init>(r9, r11)
            o09 r12 = new o09
            r12.<init>(r9, r11)
            r9 = r1
            vnd r1 = new vnd
            r11 = r12
            java.lang.String r12 = ""
            java.lang.String r14 = ""
            aod$f r13 = aod.f.c
            r16 = r9
            r9 = r8
            r17 = r8
            r8 = r2
            r2 = r17
            r17 = r0
            r0 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.add(r1)
            r1 = r0
            r0 = r17
            goto L72
        Lc0:
            r0 = r1
            return r0
        Lc2:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r86.G(r86, zh1, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.io.Serializable P(defpackage.r86 r4, defpackage.c10 r5, defpackage.pu2 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.j86
            if (r0 == 0) goto L13
            r0 = r6
            j86 r0 = (defpackage.j86) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            j86 r0 = new j86
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r4 = r0.L$0
            r86 r4 = (defpackage.r86) r4
            defpackage.r7d.b(r6)
            goto L4b
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r3
        L34:
            defpackage.r7d.b(r6)
            k86 r6 = new k86
            r6.<init>(r4, r3)
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r2
            java.lang.Object r6 = r4.r(r6, r5, r0)
            g13 r4 = defpackage.g13.a
            if (r6 != r4) goto L4b
            return r4
        L4b:
            wg0 r6 = (defpackage.wg0) r6
            java.lang.Object r4 = r6.b()
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L58
            zr4 r4 = defpackage.zr4.a
            return r4
        L58:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.t92.r0(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L69:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7d
            java.lang.Object r6 = r4.next()
            ep0 r6 = (defpackage.ep0) r6
            vnd r6 = defpackage.wnd.b(r6)
            r5.add(r6)
            goto L69
        L7d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r86.P(r86, c10, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object g(defpackage.r86 r4, java.lang.String r5, defpackage.ug2 r6, defpackage.pu2 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.h86
            if (r0 == 0) goto L13
            r0 = r7
            h86 r0 = (defpackage.h86) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            h86 r0 = new h86
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L32
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r4 = r0.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r0.L$0
            r86 r4 = (defpackage.r86) r4
            defpackage.r7d.b(r7)
            goto L51
        L32:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r3
        L38:
            defpackage.r7d.b(r7)
            i86 r7 = new i86
            r7.<init>(r4, r5, r3)
            r0.L$0 = r3
            r0.L$1 = r3
            r0.L$2 = r3
            r0.label = r2
            java.lang.Object r7 = r4.r(r7, r6, r0)
            g13 r4 = defpackage.g13.a
            if (r7 != r4) goto L51
            return r4
        L51:
            wg0 r7 = (defpackage.wg0) r7
            boolean r4 = r7.d()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r86.g(r86, java.lang.String, ug2, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object n(defpackage.r86 r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, defpackage.xd r14, defpackage.pu2 r15) {
        /*
            boolean r0 = r15 instanceof defpackage.p86
            if (r0 == 0) goto L13
            r0 = r15
            p86 r0 = (defpackage.p86) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            p86 r0 = new p86
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L48
            if (r1 != r2) goto L42
            java.lang.Object r10 = r0.L$6
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r10 = r0.L$5
            s98 r10 = (defpackage.s98) r10
            java.lang.Object r10 = r0.L$4
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r10 = r0.L$3
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.L$0
            r86 r10 = (defpackage.r86) r10
            defpackage.r7d.b(r15)
            goto L8b
        L42:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r10)
            return r3
        L48:
            defpackage.r7d.b(r15)
            xi r15 = new xi
            r1 = 6
            r15.<init>(r1)
            ra8 r15 = defpackage.sa8.a(r15)
            by8 r1 = new by8
            mve r4 = defpackage.mve.a
            kotlinx.serialization.json.JsonElement$Companion r5 = kotlinx.serialization.json.JsonElement.Companion
            kotlinx.serialization.KSerializer r5 = r5.serializer()
            r1.<init>(r4, r5)
            java.lang.Object r13 = r15.c(r1, r13)
            r8 = r13
            java.util.Map r8 = (java.util.Map) r8
            q86 r4 = new q86
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r3
            r0.L$1 = r3
            r0.L$2 = r3
            r0.L$3 = r3
            r0.L$4 = r3
            r0.L$5 = r3
            r0.L$6 = r3
            r0.label = r2
            java.lang.Object r15 = r5.r(r4, r14, r0)
            g13 r10 = defpackage.g13.a
            if (r15 != r10) goto L8b
            return r10
        L8b:
            wg0 r15 = (defpackage.wg0) r15
            java.lang.Object r10 = r15.b()
            sre r10 = (defpackage.sre) r10
            if (r10 == 0) goto L9e
            ep0 r10 = r10.c
            if (r10 == 0) goto L9e
            vnd r10 = defpackage.wnd.b(r10)
            return r10
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r86.n(r86, java.lang.String, java.lang.String, java.lang.String, xd, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object s(defpackage.r86 r4, java.lang.String r5, defpackage.uv r6, defpackage.pu2 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.n86
            if (r0 == 0) goto L13
            r0 = r7
            n86 r0 = (defpackage.n86) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            n86 r0 = new n86
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L32
            java.lang.Object r4 = r0.L$2
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r4 = r0.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r0.L$0
            r86 r4 = (defpackage.r86) r4
            defpackage.r7d.b(r7)
            goto L51
        L32:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r3
        L38:
            defpackage.r7d.b(r7)
            o86 r7 = new o86
            r7.<init>(r4, r5, r3)
            r0.L$0 = r3
            r0.L$1 = r3
            r0.L$2 = r3
            r0.label = r2
            java.lang.Object r7 = r4.r(r7, r6, r0)
            g13 r4 = defpackage.g13.a
            if (r7 != r4) goto L51
            return r4
        L51:
            wg0 r7 = (defpackage.wg0) r7
            java.lang.Object r4 = r7.b()
            py7 r4 = (defpackage.py7) r4
            if (r4 == 0) goto L5e
            boolean r4 = r4.a
            goto L5f
        L5e:
            r4 = 0
        L5f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r86.s(r86, java.lang.String, uv, pu2):java.lang.Object");
    }

    default Serializable F(zh1 zh1Var, t76 t76Var) {
        return G(this, zh1Var, t76Var);
    }

    default Object I(String str, uv uvVar, GhostwriterDebugFragment.f fVar) {
        return s(this, str, uvVar, fVar);
    }

    default Serializable L(c10 c10Var, v76 v76Var) {
        return P(this, c10Var, v76Var);
    }

    default Object S(String str, String str2, String str3, xd xdVar, GhostwriterDebugFragment.g gVar) {
        return n(this, str, str2, str3, xdVar, gVar);
    }

    default List i(u76 u76Var) {
        int i = s86.a;
        return u63.a0(new ljg("John", "Doe", "Austin, TX", "Software Developer", "615-555-1234", u63.a0("Kotlin", "Swift", "Database Management", "Version Control", "System Design"), u63.a0(new njg("Indeed", "Austin, TX", "Software Developer II", "1/1/2020", null, "Working as a SWE II on mobile applications. Specialization in iOS native development with Swift."), new njg("Meta", "Austin, TX", "Software Developer I", "1/1/2019", "1/1/2020", "Working as a SWE I on mobile applications. Specialization in Android native development with Kotlin."))), new ljg("Jane", "Doe", "Denver, CO", "Barista - Manager", "615-555-4321", u63.a0("Late Art", "Schedule Management", "Payroll Management Systems", "Inventory Management"), u63.a0(new njg("Scooter's", "Denver, CO", "Floor Manager - Barista", "1/1/2020", null, "Working on-site at a franchised location, organizing employee schedules and setting team hours. Managed 20+ employees payroll and workhours to ensure consistent staffing. Managed and ordered suppliesfor location to ensure a steady supply of ingredients."), new njg("Starbucks", "Denver, CO", "Barista", "1/1/2018", "1/1/2020", "Working on-site crafting drinks and meals for customers."))), new ljg("Jamie", "Smith", "Houston, TX", "ER Nurse", "615-555-6767", u63.a0("Organization", "Crisis Management", "CPR Certified", "Nursing License", "Flexible Hours"), u63.Z(new njg("Houston General", "Houston, TX", "ER Nurse", "1/1/2019", null, "ER Nurse responding to critical patients. Managing 5+ patients at a time, prepping for surgery and managing incidents."))), new ljg("Joseph", "Smith", "New York, NY", "Sales Analyst", "615-555-9900", u63.a0("Data Aggregation", "Microsoft Excel", "Advertisement Scheduling"), u63.a0(new njg("Goldman Sachs", "New York, NY", "Senior Analyst", "1/1/2020", null, "Conducted research in macro trends across various markets such as auto, real-estate, and consumer electronics. Reviewed analyses and made recommendations on highest quality investments to junior analysts."), new njg("Investment Firm", "New York, NY", "Junior Analyst", "1/1/2018", "1/1/2020", "Conducted research in macro trends across various markets such as auto, real-estate, and consumer electronics. Delivered simplified analyses to partners."))));
    }

    default Object y(String str, ug2 ug2Var, s76 s76Var) {
        return g(this, str, ug2Var, s76Var);
    }
}
