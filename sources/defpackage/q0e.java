package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.s;
import androidx.navigation.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.events.EventRecord;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.KSerializer;
import org.koin.core.error.NoBeanDefFoundException;

/* JADX INFO: loaded from: classes2.dex */
public final class q0e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, String str2, final boolean z, final String str3, final y1e y1eVar, final i3d i3dVar, final fnf fnfVar, final Function1 function1, final kta ktaVar, final gu5 gu5Var, final Function1 function12, final g gVar, final FragmentManager fragmentManager, final e eVar, Function1 function13, final String str4, b bVar, final int i) {
        String str5;
        Function1 function14;
        c cVar;
        Object k0eVar;
        iba ibaVar;
        gu5 gu5Var2;
        ra9 ra9Var;
        ra9 ra9Var2;
        ra9 ra9Var3;
        ra9 ra9Var4;
        g4a g4aVar;
        int i2;
        int i3;
        String str6;
        int i4;
        ra9 ra9Var5;
        int i5;
        Object obj;
        y1eVar.getClass();
        i3dVar.getClass();
        fnfVar.getClass();
        function1.getClass();
        ktaVar.getClass();
        gu5Var.getClass();
        function12.getClass();
        function13.getClass();
        c cVarH = bVar.h(1870647414);
        int i6 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.K(str2) ? 32 : 16) | (cVarH.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128) | (cVarH.K(str3) ? 2048 : 1024) | (cVarH.x(y1eVar) ? 16384 : 8192) | (cVarH.x(i3dVar) ? 131072 : 65536) | (cVarH.x(fnfVar) ? 1048576 : 524288) | (cVarH.x(function1) ? 8388608 : 4194304) | (cVarH.x(ktaVar) ? 67108864 : 33554432) | (cVarH.x(gu5Var) ? 536870912 : 268435456);
        int i7 = 24576 | (cVarH.x(function12) ? (char) 4 : (char) 2) | (cVarH.x(gVar) ? ' ' : (char) 16) | (cVarH.x(fragmentManager) ? (char) 256 : (char) 128) | (cVarH.x(eVar) ? (char) 2048 : (char) 1024) | (cVarH.K(str4) ? (char) 0 : (char) 0);
        if (cVarH.o(i6 & 1, ((306783379 & i6) == 306783378 && (i7 & 74899) == 74898) ? false : true)) {
            final Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            final iba ibaVarB = q92.B(new s[0], cVarH);
            q8 q8Var = new q8();
            boolean zX = cVarH.x(y1eVar) | cVarH.x(ibaVarB);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new bb3(4, y1eVar, ibaVarB);
                cVarH.p(objV);
            }
            ra9 ra9VarL = ypd.L(q8Var, (Function1) objV, cVarH);
            wu5 wu5Var = new wu5() { // from class: b0e
                @Override // defpackage.wu5
                public final Object q(Object obj2, Object obj3, Object obj4) {
                    String str7 = (String) obj2;
                    b bVar2 = (b) obj3;
                    ((Integer) obj4).getClass();
                    str7.getClass();
                    bVar2.L(-936004080);
                    p8 p8Var = new p8(str7);
                    y1e y1eVar2 = y1eVar;
                    boolean zX2 = bVar2.x(y1eVar2);
                    Context context2 = context;
                    boolean zX3 = zX2 | bVar2.x(context2);
                    iba ibaVar2 = ibaVarB;
                    boolean zX4 = zX3 | bVar2.x(ibaVar2);
                    Object objV2 = bVar2.v();
                    if (zX4 || objV2 == b.a.a) {
                        objV2 = new v41(2, y1eVar2, context2, ibaVar2);
                        bVar2.p(objV2);
                    }
                    ra9 ra9VarL2 = ypd.L(p8Var, (Function1) objV2, bVar2);
                    bVar2.F();
                    return ra9VarL2;
                }
            };
            ra9 ra9Var6 = (ra9) wu5Var.q("application/pdf", cVarH, 6);
            ra9 ra9Var7 = (ra9) wu5Var.q("image/png", cVarH, 6);
            ra9 ra9Var8 = (ra9) wu5Var.q("image/jpg", cVarH, 6);
            ra9 ra9Var9 = (ra9) wu5Var.q("image/jpeg", cVarH, 6);
            boolean zX2 = cVarH.x(ibaVarB);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new pg(ibaVarB, 7);
                cVarH.p(objV2);
            }
            gu5 gu5Var3 = (gu5) objV2;
            final g4a g4aVarA = r.a(y1eVar.d0, cVarH);
            g4a g4aVarA2 = r.a(ktaVar.e, cVarH);
            boolean zX3 = ((i6 & 14) == 4) | cVarH.x(y1eVar) | ((i6 & 896) == 256) | ((i7 & 458752) == 131072);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                ibaVar = ibaVarB;
                gu5Var2 = gu5Var3;
                ra9Var = ra9Var6;
                ra9Var2 = ra9Var7;
                ra9Var3 = ra9Var8;
                ra9Var4 = ra9Var9;
                g4aVar = g4aVarA2;
                i2 = 32;
                i3 = i6;
                k0eVar = new k0e(null, y1eVar, str, str4, z);
                str6 = str;
                cVarH.p(k0eVar);
            } else {
                k0eVar = objV3;
                ibaVar = ibaVarB;
                gu5Var2 = gu5Var3;
                ra9Var = ra9Var6;
                ra9Var2 = ra9Var7;
                ra9Var3 = ra9Var8;
                ra9Var4 = ra9Var9;
                g4aVar = g4aVarA2;
                i2 = 32;
                str6 = str;
                i3 = i6;
            }
            to4.d(cVarH, str6, (Function2) k0eVar);
            int i8 = i3 & 112;
            int i9 = 29360128 & i3;
            boolean zX4 = (i8 == i2) | cVarH.x(y1eVar) | (i9 == 8388608);
            Object objV4 = cVarH.v();
            if (zX4 || objV4 == c0020a) {
                str5 = str2;
                i4 = i9;
                ra9Var5 = ra9VarL;
                i5 = i8;
                l0e l0eVar = new l0e(str5, y1eVar, function13, function1, null);
                cVarH.p(l0eVar);
                objV4 = l0eVar;
            } else {
                str5 = str2;
                i4 = i9;
                ra9Var5 = ra9VarL;
                i5 = i8;
            }
            to4.d(cVarH, str5, (Function2) objV4);
            ConversationRecord conversationRecord = ((x1e) g4aVarA.getValue()).a;
            String id = conversationRecord != null ? conversationRecord.getId() : null;
            boolean zK = cVarH.K(g4aVarA) | cVarH.x(ktaVar);
            Object objV5 = cVarH.v();
            if (zK || objV5 == c0020a) {
                objV5 = new m0e(null, ktaVar, g4aVarA);
                cVarH.p(objV5);
            }
            to4.d(cVarH, id, (Function2) objV5);
            ConversationRecord conversationRecord2 = ((x1e) g4aVarA.getValue()).a;
            Boolean boolValueOf = conversationRecord2 != null ? Boolean.valueOf(conversationRecord2.isExisting()) : null;
            boolean zK2 = cVarH.K(g4aVarA) | (i5 == 32);
            Object objV6 = cVarH.v();
            if (zK2 || objV6 == c0020a) {
                function14 = function13;
                objV6 = new n0e(g4aVarA, str5, function14, null);
                cVarH.p(objV6);
            } else {
                function14 = function13;
            }
            to4.d(cVarH, boolValueOf, (Function2) objV6);
            boolean zX5 = ((i3 & 7168) == 2048) | cVarH.x(y1eVar);
            Object objV7 = cVarH.v();
            if (zX5 || objV7 == c0020a) {
                objV7 = new o0e(null, y1eVar, str3);
                cVarH.p(objV7);
            }
            to4.d(cVarH, str3, (Function2) objV7);
            r0e r0eVar = r0e.INSTANCE;
            final ra9 ra9Var10 = ra9Var5;
            final ra9 ra9Var11 = ra9Var2;
            boolean zK3 = ((i3 & 1879048192) == 536870912) | cVarH.K(g4aVar) | cVarH.x(y1eVar) | cVarH.x(fnfVar) | (i4 == 8388608) | cVarH.x(ibaVar) | cVarH.x(ra9Var10) | cVarH.x(gVar) | ((i7 & 14) == 4) | cVarH.x(fragmentManager) | cVarH.x(eVar) | cVarH.K(g4aVarA) | cVarH.x(ra9Var) | cVarH.x(ra9Var11);
            final ra9 ra9Var12 = ra9Var3;
            boolean zX6 = zK3 | cVarH.x(ra9Var12);
            final ra9 ra9Var13 = ra9Var4;
            boolean zX7 = zX6 | cVarH.x(ra9Var13) | cVarH.K(gu5Var2) | cVarH.x(ktaVar) | cVarH.x(i3dVar);
            Object objV8 = cVarH.v();
            if (zX7 || objV8 == c0020a) {
                final ra9 ra9Var14 = ra9Var;
                cVar = cVarH;
                final g4a g4aVar2 = g4aVar;
                final gu5 gu5Var4 = gu5Var2;
                final iba ibaVar2 = ibaVar;
                obj = new Function1() { // from class: c0e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        gba gbaVar = (gba) obj2;
                        gbaVar.getClass();
                        final y1e y1eVar2 = y1eVar;
                        final fnf fnfVar2 = fnfVar;
                        final Function1 function15 = function1;
                        final iba ibaVar3 = ibaVar2;
                        final ra9 ra9Var15 = ra9Var10;
                        final g gVar2 = gVar;
                        final gu5 gu5Var5 = gu5Var;
                        final Function1 function16 = function12;
                        final FragmentManager fragmentManager2 = fragmentManager;
                        final e eVar2 = eVar;
                        final ese eseVar = g4aVar2;
                        ah2 ah2Var = new ah2(-1097502955, new xu5() { // from class: e0e
                            @Override // defpackage.xu5
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                b bVar2 = (b) obj5;
                                ((Integer) obj6).getClass();
                                ((bd0) obj3).getClass();
                                ((d) obj4).getClass();
                                jta jtaVar = (jta) eseVar.getValue();
                                Function1 function17 = function15;
                                boolean zK4 = bVar2.K(function17);
                                Object objV9 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zK4 || objV9 == c0020a2) {
                                    objV9 = new zzd(function17, 0);
                                    bVar2.p(objV9);
                                }
                                gu5 gu5Var6 = (gu5) objV9;
                                iba ibaVar4 = ibaVar3;
                                boolean zX8 = bVar2.x(ibaVar4);
                                Object objV10 = bVar2.v();
                                if (zX8 || objV10 == c0020a2) {
                                    objV10 = new fh(ibaVar4, 4);
                                    bVar2.p(objV10);
                                }
                                gu5 gu5Var7 = (gu5) objV10;
                                ra9 ra9Var16 = ra9Var15;
                                boolean zX9 = bVar2.x(ra9Var16);
                                Object objV11 = bVar2.v();
                                if (zX9 || objV11 == c0020a2) {
                                    objV11 = new ig(ra9Var16, 21);
                                    bVar2.p(objV11);
                                }
                                gu5 gu5Var8 = (gu5) objV11;
                                g gVar3 = gVar2;
                                boolean zX10 = bVar2.x(gVar3);
                                y1e y1eVar3 = y1eVar2;
                                boolean zX11 = zX10 | bVar2.x(y1eVar3) | bVar2.x(ibaVar4);
                                Object objV12 = bVar2.v();
                                if (zX11 || objV12 == c0020a2) {
                                    objV12 = new a0e(gVar3, y1eVar3, ibaVar4);
                                    bVar2.p(objV12);
                                }
                                Function2 function2 = (Function2) objV12;
                                boolean zX12 = bVar2.x(ibaVar4);
                                Object objV13 = bVar2.v();
                                if (zX12 || objV13 == c0020a2) {
                                    objV13 = new w91(ibaVar4, 8);
                                    bVar2.p(objV13);
                                }
                                w1e.b(y1eVar3, fnfVar2, jtaVar, gu5Var6, gu5Var7, gu5Var8, function2, gu5Var5, function16, fragmentManager2, eVar2, (Function2) objV13, bVar2, 0);
                                return j6g.a;
                            }
                        }, true);
                        u uVar = gbaVar.h;
                        uVar.getClass();
                        uk2 uk2Var = (uk2) uVar.b(u.a.a(uk2.class));
                        iwc iwcVar = fwc.a;
                        vk2 vk2Var = new vk2(uk2Var, iwcVar.b(r0e.class), ah2Var);
                        vk2Var.j = null;
                        vk2Var.k = null;
                        vk2Var.l = null;
                        vk2Var.m = null;
                        gbaVar.d(vk2Var);
                        hs hsVar = new hs(14);
                        iq0 iq0Var = new iq0(15);
                        vg vgVar = new vg(20);
                        kd kdVar = new kd(17);
                        final g4a g4aVar3 = g4aVarA;
                        vk2 vk2Var2 = new vk2((uk2) uVar.b(u.a.a(uk2.class)), iwcVar.b(vw0.class), new ah2(351733310, new xu5() { // from class: f0e
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                b bVar2 = (b) obj5;
                                ((Integer) obj6).getClass();
                                ((bd0) obj3).getClass();
                                ((d) obj4).getClass();
                                File file = ((x1e) g4aVar3.getValue()).j;
                                if (file == null) {
                                    bVar2.L(-1233095519);
                                } else {
                                    bVar2.L(-1233095518);
                                    y1e y1eVar3 = y1eVar2;
                                    boolean zX8 = bVar2.x(y1eVar3) | bVar2.x(file);
                                    iba ibaVar4 = ibaVar3;
                                    boolean zX9 = zX8 | bVar2.x(ibaVar4);
                                    Object objV9 = bVar2.v();
                                    b.a.C0020a c0020a2 = b.a.a;
                                    if (zX9 || objV9 == c0020a2) {
                                        objV9 = new eu(y1eVar3, file, ibaVar4);
                                        bVar2.p(objV9);
                                    }
                                    gu5 gu5Var6 = (gu5) objV9;
                                    boolean zX10 = bVar2.x(ibaVar4);
                                    ra9 ra9Var16 = ra9Var15;
                                    boolean zX11 = zX10 | bVar2.x(ra9Var16);
                                    Object objV10 = bVar2.v();
                                    if (zX11 || objV10 == c0020a2) {
                                        objV10 = new ro2(12, ibaVar4, ra9Var16);
                                        bVar2.p(objV10);
                                    }
                                    zw0.a(file, gu5Var6, (gu5) objV10, bVar2, 0);
                                }
                                bVar2.F();
                                return j6g.a;
                            }
                        }, true));
                        vk2Var2.j = hsVar;
                        vk2Var2.k = iq0Var;
                        vk2Var2.l = vgVar;
                        vk2Var2.m = kdVar;
                        gbaVar.d(vk2Var2);
                        final ra9 ra9Var16 = ra9Var14;
                        final ra9 ra9Var17 = ra9Var11;
                        final ra9 ra9Var18 = ra9Var12;
                        final ra9 ra9Var19 = ra9Var13;
                        final gu5 gu5Var6 = gu5Var4;
                        vk2 vk2Var3 = new vk2((uk2) uVar.b(u.a.a(uk2.class)), iwcVar.b(qw0.class), new ah2(310777949, new xu5() { // from class: g0e
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                b bVar2 = (b) obj5;
                                ((Integer) obj6).getClass();
                                ((bd0) obj3).getClass();
                                ((d) obj4).getClass();
                                EventRecord.Attachment attachment = ((x1e) g4aVar3.getValue()).k;
                                if (attachment == null) {
                                    bVar2.L(-1563533706);
                                } else {
                                    bVar2.L(-1563533705);
                                    boolean zX8 = bVar2.x(attachment);
                                    ra9 ra9Var20 = ra9Var16;
                                    boolean zX9 = zX8 | bVar2.x(ra9Var20);
                                    ra9 ra9Var21 = ra9Var17;
                                    boolean zX10 = zX9 | bVar2.x(ra9Var21);
                                    ra9 ra9Var22 = ra9Var18;
                                    boolean zX11 = zX10 | bVar2.x(ra9Var22);
                                    ra9 ra9Var23 = ra9Var19;
                                    boolean zX12 = zX11 | bVar2.x(ra9Var23);
                                    Object objV9 = bVar2.v();
                                    b.a.C0020a c0020a2 = b.a.a;
                                    if (zX12 || objV9 == c0020a2) {
                                        zu0 zu0Var = new zu0(attachment, ra9Var20, ra9Var21, ra9Var22, ra9Var23, 2);
                                        bVar2.p(zu0Var);
                                        objV9 = zu0Var;
                                    }
                                    gu5 gu5Var7 = (gu5) objV9;
                                    y1e y1eVar3 = y1eVar2;
                                    boolean zX13 = bVar2.x(y1eVar3);
                                    gu5 gu5Var8 = gu5Var6;
                                    boolean zK4 = zX13 | bVar2.K(gu5Var8);
                                    Object objV10 = bVar2.v();
                                    if (zK4 || objV10 == c0020a2) {
                                        objV10 = new yp0(10, y1eVar3, gu5Var8);
                                        bVar2.p(objV10);
                                    }
                                    tw0.a(attachment, gu5Var7, (gu5) objV10, bVar2, 0);
                                }
                                bVar2.F();
                                return j6g.a;
                            }
                        }, true));
                        vk2Var3.j = null;
                        vk2Var3.k = null;
                        vk2Var3.l = null;
                        vk2Var3.m = null;
                        gbaVar.d(vk2Var3);
                        final kta ktaVar2 = ktaVar;
                        vk2 vk2Var4 = new vk2((uk2) uVar.b(u.a.a(uk2.class)), iwcVar.b(uv2.class), new ah2(269822588, new xu5() { // from class: h0e
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                b bVar2 = (b) obj5;
                                ((Integer) obj6).getClass();
                                ((bd0) obj3).getClass();
                                ((d) obj4).getClass();
                                ConversationRecord conversationRecord3 = ((x1e) g4aVar3.getValue()).a;
                                if (conversationRecord3 == null) {
                                    bVar2.L(-1893985192);
                                } else {
                                    bVar2.L(-1893985191);
                                    jta jtaVar = (jta) eseVar.getValue();
                                    gu5 gu5Var7 = gu5Var6;
                                    boolean zK4 = bVar2.K(gu5Var7);
                                    Object objV9 = bVar2.v();
                                    b.a.C0020a c0020a2 = b.a.a;
                                    if (zK4 || objV9 == c0020a2) {
                                        objV9 = new sd(12, gu5Var7);
                                        bVar2.p(objV9);
                                    }
                                    gu5 gu5Var8 = (gu5) objV9;
                                    y1e y1eVar3 = y1eVar2;
                                    boolean zX8 = bVar2.x(y1eVar3);
                                    Function1 function17 = function15;
                                    boolean zK5 = zX8 | bVar2.K(function17) | bVar2.K(gu5Var7);
                                    Object objV10 = bVar2.v();
                                    if (zK5 || objV10 == c0020a2) {
                                        objV10 = new vv2(3, y1eVar3, gu5Var7, function17);
                                        bVar2.p(objV10);
                                    }
                                    gu5 gu5Var9 = (gu5) objV10;
                                    iba ibaVar4 = ibaVar3;
                                    boolean zX9 = bVar2.x(ibaVar4);
                                    Object objV11 = bVar2.v();
                                    if (zX9 || objV11 == c0020a2) {
                                        objV11 = new xg(ibaVar4, 4);
                                        bVar2.p(objV11);
                                    }
                                    gu5 gu5Var10 = (gu5) objV11;
                                    kta ktaVar3 = ktaVar2;
                                    boolean zX10 = bVar2.x(ktaVar3);
                                    Object objV12 = bVar2.v();
                                    if (zX10 || objV12 == c0020a2) {
                                        objV12 = new a3(ktaVar3, 23);
                                        bVar2.p(objV12);
                                    }
                                    dw2.a(conversationRecord3, jtaVar, gu5Var8, gu5Var9, gu5Var10, (Function1) objV12, fragmentManager2, eVar2, bVar2, 0);
                                }
                                bVar2.F();
                                return j6g.a;
                            }
                        }, true));
                        vk2Var4.j = null;
                        vk2Var4.k = null;
                        vk2Var4.l = null;
                        vk2Var4.m = null;
                        gbaVar.d(vk2Var4);
                        final i3d i3dVar2 = i3dVar;
                        vk2 vk2Var5 = new vk2((uk2) uVar.b(u.a.a(uk2.class)), iwcVar.b(a3d.class), new ah2(228867227, new xu5() { // from class: i0e
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                b bVar2 = (b) obj5;
                                ((Integer) obj6).getClass();
                                ((bd0) obj3).getClass();
                                ((d) obj4).getClass();
                                ConversationRecord conversationRecord3 = ((x1e) g4aVar3.getValue()).a;
                                if (conversationRecord3 == null) {
                                    bVar2.L(2070514436);
                                } else {
                                    bVar2.L(2070514437);
                                    String id2 = conversationRecord3.getId();
                                    i3d i3dVar3 = i3dVar2;
                                    boolean zX8 = bVar2.x(i3dVar3) | bVar2.x(conversationRecord3);
                                    Object objV9 = bVar2.v();
                                    b.a.C0020a c0020a2 = b.a.a;
                                    if (zX8 || objV9 == c0020a2) {
                                        objV9 = new p0e(i3dVar3, conversationRecord3, null);
                                        bVar2.p(objV9);
                                    }
                                    to4.d(bVar2, id2, (Function2) objV9);
                                    iba ibaVar4 = ibaVar3;
                                    boolean zX9 = bVar2.x(ibaVar4);
                                    Object objV10 = bVar2.v();
                                    if (zX9 || objV10 == c0020a2) {
                                        objV10 = new zr(ibaVar4, 3);
                                        bVar2.p(objV10);
                                    }
                                    gu5 gu5Var7 = (gu5) objV10;
                                    Function1 function17 = function15;
                                    boolean zK4 = bVar2.K(function17);
                                    Object objV11 = bVar2.v();
                                    if (zK4 || objV11 == c0020a2) {
                                        objV11 = new as2(function17, 2);
                                        bVar2.p(objV11);
                                    }
                                    d3d.a(i3dVar3, fnfVar2, gu5Var7, (gu5) objV11, bVar2, 0);
                                }
                                bVar2.F();
                                return j6g.a;
                            }
                        }, true));
                        vk2Var5.j = null;
                        vk2Var5.k = null;
                        vk2Var5.l = null;
                        vk2Var5.m = null;
                        gbaVar.d(vk2Var5);
                        vk2 vk2Var6 = new vk2((uk2) uVar.b(u.a.a(uk2.class)), iwcVar.b(eq4.class), new ah2(187911866, new xu5() { // from class: j0e
                            @Override // defpackage.xu5
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) throws NoBeanDefFoundException {
                                d dVar = (d) obj4;
                                b bVar2 = (b) obj5;
                                ((Integer) obj6).getClass();
                                ((bd0) obj3).getClass();
                                dVar.getClass();
                                Bundle bundleA = dVar.a();
                                if (bundleA == null) {
                                    bundleA = new Bundle();
                                }
                                Map mapG0 = lc9.g0(dVar.b.V);
                                LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(mapG0.size()));
                                for (Map.Entry entry : mapG0.entrySet()) {
                                    linkedHashMap.put(entry.getKey(), ((androidx.navigation.b) entry.getValue()).a);
                                }
                                KSerializer<eq4> kSerializerSerializer = eq4.Companion.serializer();
                                kSerializerSerializer.getClass();
                                eq4 eq4VarDeserialize = kSerializerSerializer.deserialize(new rgd(bundleA, linkedHashMap));
                                String str7 = eq4VarDeserialize.a;
                                String str8 = eq4VarDeserialize.b;
                                iba ibaVar4 = ibaVar3;
                                boolean zX8 = bVar2.x(ibaVar4);
                                Object objV9 = bVar2.v();
                                if (zX8 || objV9 == b.a.a) {
                                    objV9 = new xe(ibaVar4, 3);
                                    bVar2.p(objV9);
                                }
                                hq4.a(0, (gu5) objV9, bVar2, str7, str8);
                                return j6g.a;
                            }
                        }, true));
                        vk2Var6.j = null;
                        vk2Var6.k = null;
                        vk2Var6.l = null;
                        vk2Var6.m = null;
                        gbaVar.d(vk2Var6);
                        return j6g.a;
                    }
                };
                ibaVar = ibaVar2;
                cVar.p(obj);
            } else {
                obj = objV8;
                cVar = cVarH;
            }
            nba.b(ibaVar, r0eVar, null, null, null, null, null, null, null, null, null, (Function1) obj, cVar, 0, 0, 2044);
        } else {
            str5 = str2;
            function14 = function13;
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            final Function1 function15 = function14;
            final String str7 = str5;
            iVarW.d = new Function2(str, str7, z, str3, y1eVar, i3dVar, fnfVar, function1, ktaVar, gu5Var, function12, gVar, fragmentManager, eVar, function15, str4, i) { // from class: d0e
                public final /* synthetic */ fnf V;
                public final /* synthetic */ Function1 W;
                public final /* synthetic */ kta X;
                public final /* synthetic */ gu5 Y;
                public final /* synthetic */ Function1 Z;
                public final /* synthetic */ String a;
                public final /* synthetic */ g a0;
                public final /* synthetic */ String b;
                public final /* synthetic */ FragmentManager b0;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ e c0;
                public final /* synthetic */ String d;
                public final /* synthetic */ Function1 d0;
                public final /* synthetic */ y1e e;
                public final /* synthetic */ String e0;
                public final /* synthetic */ i3d f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = ka2.L(1);
                    q0e.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, this.e0, (b) obj2, iL);
                    return j6g.a;
                }
            };
        }
    }
}
