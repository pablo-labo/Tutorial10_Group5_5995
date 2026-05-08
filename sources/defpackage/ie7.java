package defpackage;

import android.text.TextPaint;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.navigation.p;
import androidx.navigation.q;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
@fd8
public class ie7 implements nvh, lv8, z54, l4d, kqc {
    public static String V = "https://interviews.sandbox.qa.indeed.net/";
    public static String W = "";
    public static String X = "";
    public static String Y = "";
    public static String Z = "";
    public static String a0 = "";
    public static String b0 = "";
    public static String c0 = "";
    public static String d = "https://myjobs-qa.sandbox.qa.indeed.net";
    public static gsa d0 = null;
    public static String e = "https://apply.qa.indeed.net/";
    public static String f = "https://www.qa.indeed.net/m/";
    public final /* synthetic */ int a;
    public static final Object b = new Object();
    public static final ah2 c = new ah2(-1221290842, new pi2(0), false);
    public static Function1 e0 = new tb(4);
    public static final g13 f0 = g13.a;
    public static final qmc g0 = new rmc();
    public static final idd h0 = new idd(0.16f, 0.1f, 0.08f, 0.1f);
    public static final ie7 i0 = new ie7(7);
    public static final ie7 j0 = new ie7(8);
    public static final ie7 k0 = new ie7(9);
    public static final ie7 l0 = new ie7(10);
    public static final ie7 m0 = new ie7(11);

    public /* synthetic */ ie7(int i) {
        this.a = i;
    }

    public static final String A(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static final void e(String str, Function1 function1, String str2, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-66417787);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                function1 = (Function1) cVarH.M(w3f.c);
                str2 = (String) cVarH.M(w3f.a);
            } else {
                cVarH.D();
            }
            int i3 = i2 & (-1009);
            cVarH.V();
            boolean zK = cVarH.K(function1) | ((i3 & 14) == 4) | cVarH.K(str2);
            Object objV = cVarH.v();
            if (zK || objV == b.a.a) {
                objV = new m49(str, function1, str2, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, str, (Function2) objV);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new l49(i, str, str2, function1);
        }
    }

    public static final void f(Encoder encoder) {
        encoder.getClass();
        if ((encoder instanceof pa8 ? (pa8) encoder : null) != null) {
            return;
        }
        r6.g(ia.m(fwc.a, encoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static final ha8 g(Decoder decoder) {
        decoder.getClass();
        ha8 ha8Var = decoder instanceof ha8 ? (ha8) decoder : null;
        if (ha8Var != null) {
            return ha8Var;
        }
        r6.g(ia.m(fwc.a, decoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
        return null;
    }

    public static final String h(String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    public static int i(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static final boolean j(FocusTargetNode focusTargetNode, boolean z) {
        int iOrdinal = focusTargetNode.P().ordinal();
        ym5 ym5Var = ym5.d;
        if (iOrdinal == 0) {
            us3.g(focusTargetNode).getFocusOwner().q(null);
            focusTargetNode.c2(ym5.a, ym5Var);
            return true;
        }
        if (iOrdinal == 1) {
            FocusTargetNode focusTargetNodeC = dn5.c(focusTargetNode);
            if (!(focusTargetNodeC != null ? j(focusTargetNodeC, z) : true)) {
                return false;
            }
            focusTargetNode.c2(ym5.b, ym5Var);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            l.g();
            return false;
        }
        if (z) {
            us3.g(focusTargetNode).getFocusOwner().q(null);
            focusTargetNode.c2(ym5.c, ym5Var);
        }
        return z;
    }

    public static final i04 k(t3 t3Var, ul2 ul2Var, String str) {
        t3Var.getClass();
        i04 i04VarA = t3Var.a(ul2Var, str);
        if (i04VarA != null) {
            return i04VarA;
        }
        cr8.E(t3Var.c(), str);
        throw null;
    }

    public static final r7e l(t3 t3Var, Encoder encoder, Object obj) {
        t3Var.getClass();
        obj.getClass();
        r7e r7eVarB = t3Var.b(encoder, obj);
        if (r7eVarB != null) {
            return r7eVarB;
        }
        yd8 yd8VarB = fwc.a.b(obj.getClass());
        yd8 yd8VarC = t3Var.c();
        yd8VarC.getClass();
        String strR = yd8VarB.r();
        if (strR == null) {
            strR = String.valueOf(yd8VarB);
        }
        cr8.E(yd8VarC, strR);
        throw null;
    }

    public static WritableMap n(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", str);
        return writableMapCreateMap;
    }

    public static final boolean o(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!wl7.b(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final boolean p(int i, String str) {
        char cCharAt = str.charAt(i);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static final p q(Function1 function1) {
        function1.getClass();
        q qVar = new q();
        function1.invoke(qVar);
        boolean z = qVar.b;
        boolean z2 = qVar.c;
        int i = qVar.d;
        boolean z3 = qVar.e;
        p.a aVar = qVar.a;
        return new p(z, z2, i, false, z3, aVar.a, aVar.b, -1, -1);
    }

    public static final na3 r(FocusTargetNode focusTargetNode, int i) {
        int iOrdinal = focusTargetNode.P().ordinal();
        na3 na3Var = na3.a;
        if (iOrdinal != 0) {
            na3 na3Var2 = na3.b;
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = dn5.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    l5.q("ActiveParent with no focused child");
                    return null;
                }
                na3 na3VarR = r(focusTargetNodeC, i);
                na3 na3Var3 = na3VarR != na3Var ? na3VarR : null;
                if (na3Var3 != null) {
                    return na3Var3;
                }
                if (focusTargetNode.e0) {
                    return na3Var;
                }
                focusTargetNode.e0 = true;
                try {
                    nm5 nm5VarD2 = focusTargetNode.d2();
                    hw1 hw1Var = new hw1(i);
                    im5 focusOwner = us3.g(focusTargetNode).getFocusOwner();
                    FocusTargetNode focusTargetNodeF = focusOwner.f();
                    nm5VarD2.k.invoke(hw1Var);
                    FocusTargetNode focusTargetNodeF2 = focusOwner.f();
                    if (!hw1Var.b) {
                        return (focusTargetNodeF == focusTargetNodeF2 || focusTargetNodeF2 == null) ? na3Var : sm5.d == sm5.c ? na3Var2 : na3.c;
                    }
                    sm5 sm5Var = sm5.b;
                    return na3Var2;
                } finally {
                    focusTargetNode.e0 = false;
                }
            }
            if (iOrdinal == 2) {
                return na3Var2;
            }
            if (iOrdinal != 3) {
                l.g();
                return null;
            }
        }
        return na3Var;
    }

    public static final na3 s(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.f0) {
            focusTargetNode.f0 = true;
            try {
                nm5 nm5VarD2 = focusTargetNode.d2();
                hw1 hw1Var = new hw1(i);
                im5 focusOwner = us3.g(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeF = focusOwner.f();
                nm5VarD2.j.invoke(hw1Var);
                FocusTargetNode focusTargetNodeF2 = focusOwner.f();
                boolean z = hw1Var.b;
                na3 na3Var = na3.b;
                if (z) {
                    sm5 sm5Var = sm5.b;
                    return na3Var;
                }
                if (focusTargetNodeF != focusTargetNodeF2 && focusTargetNodeF2 != null) {
                    return sm5.d == sm5.c ? na3Var : na3.c;
                }
            } finally {
                focusTargetNode.f0 = false;
            }
        }
        return na3.a;
    }

    public static final na3 t(FocusTargetNode focusTargetNode, int i) {
        e.c cVarB;
        ria riaVar;
        int iOrdinal = focusTargetNode.P().ordinal();
        na3 na3Var = na3.a;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = dn5.c(focusTargetNode);
                if (focusTargetNodeC != null) {
                    return r(focusTargetNodeC, i);
                }
                l5.q("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    l.g();
                    return null;
                }
                if (!focusTargetNode.a.c0) {
                    ae7.b("visitAncestors called on an unattached node");
                }
                e.c cVar = focusTargetNode.a.e;
                pm8 pm8VarF = us3.f(focusTargetNode);
                loop0: while (true) {
                    if (pm8VarF == null) {
                        cVarB = null;
                        break;
                    }
                    if ((pm8VarF.t0.f.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                        while (cVar != null) {
                            if ((cVar.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                                cVarB = cVar;
                                j4a j4aVar = null;
                                while (cVarB != null) {
                                    if (cVarB instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((cVarB.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 && (cVarB instanceof zs3)) {
                                        int i2 = 0;
                                        for (e.c cVar2 = ((zs3) cVarB).e0; cVar2 != null; cVar2 = cVar2.f) {
                                            if ((cVar2.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cVarB = cVar2;
                                                } else {
                                                    if (j4aVar == null) {
                                                        j4aVar = new j4a(new e.c[16]);
                                                    }
                                                    if (cVarB != null) {
                                                        j4aVar.b(cVarB);
                                                        cVarB = null;
                                                    }
                                                    j4aVar.b(cVar2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    cVarB = us3.b(j4aVar);
                                }
                            }
                            cVar = cVar.e;
                        }
                    }
                    pm8VarF = pm8VarF.K();
                    cVar = (pm8VarF == null || (riaVar = pm8VarF.t0) == null) ? null : riaVar.e;
                }
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                if (focusTargetNode2 == null) {
                    return na3Var;
                }
                int iOrdinal2 = focusTargetNode2.P().ordinal();
                if (iOrdinal2 == 0) {
                    return s(focusTargetNode2, i);
                }
                if (iOrdinal2 == 1) {
                    return t(focusTargetNode2, i);
                }
                if (iOrdinal2 == 2) {
                    return na3.b;
                }
                if (iOrdinal2 != 3) {
                    l.g();
                    return null;
                }
                na3 na3VarT = t(focusTargetNode2, i);
                na3 na3Var2 = na3VarT != na3Var ? na3VarT : null;
                return na3Var2 == null ? s(focusTargetNode2, i) : na3Var2;
            }
        }
        return na3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f0 A[ADDED_TO_REGION, LOOP:9: B:144:0x01f0->B:151:0x0202, LOOP_START, PHI: r12
  0x01f0: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:143:0x01ee, B:151:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean u(androidx.compose.ui.focus.FocusTargetNode r18) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie7.u(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void v(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = defpackage.ie7.b
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L60
        L14:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L57
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.endDocument()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r5 == 0) goto L4f
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4f
            goto L4f
        L42:
            r6 = move-exception
            goto L51
        L44:
            r6 = move-exception
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales in storage "
            android.util.Log.w(r1, r2, r6)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L4f
            goto L3e
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L5f
        L51:
            if (r5 == 0) goto L56
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L56
        L56:
            throw r6     // Catch: java.lang.Throwable -> L12
        L57:
            java.lang.String r5 = "AppLocalesStorageHelper"
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing "
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
        L5f:
            return
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie7.v(android.content.Context, java.lang.String):void");
    }

    public static final Object w(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String x(android.content.Context r8) {
        /*
            java.lang.Object r0 = defpackage.ie7.b
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L64
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L44:
            if (r2 == 0) goto L56
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L56
            goto L56
        L4a:
            r8 = move-exception
            goto L6c
        L4c:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L56
            goto L46
        L56:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5d
            goto L62
        L5d:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L64:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L69
        L69:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie7.x(android.content.Context):java.lang.String");
    }

    public static final void y(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final String z(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    @Override // defpackage.z54
    public File a(kg8 kg8Var) {
        return null;
    }

    @Override // defpackage.z54
    public void b(kg8 kg8Var, yd3 yd3Var) {
    }

    @Override // defpackage.lv8
    public void c(xv8 xv8Var) {
        xv8Var.f();
    }

    @Override // defpackage.lv8
    public void d(xv8 xv8Var) {
    }

    public void m(uce uceVar, float f2, float f3) {
        throw null;
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 7:
                List<svh<?>> list = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).zzw());
            case 8:
                List<svh<?>> list2 = djh.a;
                return Long.valueOf(((xhi) yhi.b.zza()).zzd());
            case DatadogLogGenerator.CRASH /* 9 */:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((ici) nci.b.zza()).zza());
            case 10:
                List<svh<?>> list4 = djh.a;
                return Boolean.valueOf(((xdi) odi.b.zza()).zza());
            default:
                List<svh<?>> list5 = djh.a;
                return Boolean.valueOf(((gci) ybi.b.zza()).zzb());
        }
    }
}
