package defpackage;

import defpackage.o7d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class bc8 {
    public final eve a;
    public final boolean b;
    public int c;

    public bc8(aa8 aa8Var, eve eveVar) {
        this.a = eveVar;
        this.b = aa8Var.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.bc8 r9, defpackage.nk3 r10, defpackage.x81 r11) {
        /*
            eve r0 = r9.a
            boolean r1 = r11 instanceof defpackage.ac8
            if (r1 == 0) goto L15
            r1 = r11
            ac8 r1 = (defpackage.ac8) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            ac8 r1 = new ac8
            r1.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r1.result
            int r2 = r1.label
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5e
            if (r2 != r8) goto L58
            java.lang.Object r9 = r1.L$3
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.L$2
            java.util.LinkedHashMap r10 = (java.util.LinkedHashMap) r10
            java.lang.Object r0 = r1.L$1
            bc8 r0 = (defpackage.bc8) r0
            java.lang.Object r2 = r1.L$0
            nk3 r2 = (defpackage.nk3) r2
            defpackage.r7d.b(r11)
            kotlinx.serialization.json.JsonElement r11 = (kotlinx.serialization.json.JsonElement) r11
            r10.put(r9, r11)
            eve r9 = r0.a
            byte r9 = r9.e()
            if (r9 == r7) goto L53
            if (r9 != r6) goto L4b
            goto L9e
        L4b:
            eve r9 = r0.a
            java.lang.String r10 = "Expected end of the object or comma"
            defpackage.eve.m(r9, r10, r3, r4, r5)
            throw r4
        L53:
            r11 = r9
            r9 = r0
            r0 = r10
            r10 = r2
            goto L70
        L58:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            return r4
        L5e:
            defpackage.r7d.b(r11)
            byte r11 = r0.f(r5)
            byte r0 = r0.q()
            if (r0 == r7) goto Lb2
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
        L70:
            eve r2 = r9.a
            boolean r3 = r2.b()
            if (r3 == 0) goto L9b
            boolean r11 = r9.b
            if (r11 == 0) goto L81
            java.lang.String r11 = r2.j()
            goto L85
        L81:
            java.lang.String r11 = r2.i()
        L85:
            r3 = 5
            r2.f(r3)
            j6g r2 = defpackage.j6g.a
            r1.L$0 = r10
            r1.L$1 = r9
            r1.L$2 = r0
            r1.L$3 = r11
            r1.label = r8
            r10.a(r2, r1)
            g13 r9 = defpackage.g13.a
            return r9
        L9b:
            r10 = r0
            r0 = r9
            r9 = r11
        L9e:
            eve r11 = r0.a
            if (r9 != r5) goto La6
            r11.f(r6)
            goto La8
        La6:
            if (r9 == r7) goto Lae
        La8:
            kotlinx.serialization.json.JsonObject r9 = new kotlinx.serialization.json.JsonObject
            r9.<init>(r10)
            return r9
        Lae:
            defpackage.boa.A(r11)
            throw r4
        Lb2:
            eve r9 = r9.a
            java.lang.String r10 = "Unexpected leading comma"
            defpackage.eve.m(r9, r10, r3, r4, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc8.a(bc8, nk3, x81):java.lang.Object");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final JsonElement b() {
        JsonElement jsonObject;
        Object obj;
        Object objQ;
        eve eveVar = this.a;
        byte bQ = eveVar.q();
        if (bQ == 1) {
            return d(true);
        }
        if (bQ == 0) {
            return d(false);
        }
        if (bQ != 6) {
            if (bQ == 8) {
                return c();
            }
            eve.m(eveVar, "Cannot read Json element because of unexpected ".concat(ee3.z(bQ)), 0, null, 6);
            throw null;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 200) {
            zb8 zb8Var = new zb8(this, null);
            j6g j6gVar = j6g.a;
            ok3 ok3Var = new ok3();
            ok3Var.a = zb8Var;
            ok3Var.b = j6gVar;
            ok3Var.c = ok3Var;
            g13 g13Var = ie7.f0;
            ok3Var.d = g13Var;
            while (true) {
                obj = ok3Var.d;
                lu2<? super JsonElement> lu2Var = ok3Var.c;
                if (lu2Var == null) {
                    break;
                }
                if (wl7.b(g13Var, obj)) {
                    try {
                        zb8 zb8Var2 = ok3Var.a;
                        Object obj2 = ok3Var.b;
                        if (zb8Var2 == 0) {
                            zb8Var2.getClass();
                            v03 context = lu2Var.getContext();
                            Object zl7Var = context == vr4.a ? new zl7(lu2Var) : new am7(lu2Var, context);
                            pxf.d(3, zb8Var2);
                            objQ = zb8Var2.q(ok3Var, obj2, zl7Var);
                        } else {
                            pxf.d(3, zb8Var2);
                            objQ = zb8Var2.q(ok3Var, obj2, lu2Var);
                        }
                        if (objQ != g13.a) {
                            lu2Var.resumeWith(objQ);
                        }
                    } catch (Throwable th) {
                        lu2Var.resumeWith(new o7d.a(th));
                    }
                } else {
                    ok3Var.d = g13Var;
                    lu2Var.resumeWith(obj);
                }
            }
            r7d.b(obj);
            jsonObject = (JsonElement) obj;
        } else {
            byte bF = eveVar.f((byte) 6);
            if (eveVar.q() == 4) {
                eve.m(eveVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!eveVar.b()) {
                    break;
                }
                String strJ = this.b ? eveVar.j() : eveVar.i();
                eveVar.f((byte) 5);
                linkedHashMap.put(strJ, b());
                bF = eveVar.e();
                if (bF != 4) {
                    if (bF != 7) {
                        eve.m(eveVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bF == 6) {
                eveVar.f((byte) 7);
            } else if (bF == 4) {
                boa.A(eveVar);
                throw null;
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.c--;
        return jsonObject;
    }

    public final JsonArray c() {
        eve eveVar = this.a;
        byte bE = eveVar.e();
        if (eveVar.q() == 4) {
            eve.m(eveVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (eveVar.b()) {
            arrayList.add(b());
            bE = eveVar.e();
            if (bE != 4) {
                boolean z = bE == 9;
                int i = eveVar.a;
                if (!z) {
                    eve.m(eveVar, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bE == 8) {
            eveVar.f((byte) 9);
        } else if (bE == 4) {
            boa.z(eveVar, "array");
            throw null;
        }
        return new JsonArray(arrayList);
    }

    public final JsonPrimitive d(boolean z) {
        boolean z2 = this.b;
        eve eveVar = this.a;
        String strJ = (z2 || !z) ? eveVar.j() : eveVar.i();
        return (z || !wl7.b(strJ, "null")) ? new ta8(strJ, z, null) : JsonNull.INSTANCE;
    }
}
