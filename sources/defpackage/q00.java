package defpackage;

import androidx.compose.animation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.model.AiMessagingButtonType;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class q00 {
    public static final void a(final AiMessagingButtonType aiMessagingButtonType, gu5 gu5Var, e eVar, boolean z, b bVar, final int i) {
        gu5 gu5Var2;
        final boolean z2;
        final e eVar2;
        aiMessagingButtonType.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(-1129715452);
        int i2 = (cVarH.d(aiMessagingButtonType.ordinal()) ? 4 : 2) | i | (cVarH.x(gu5Var) ? 32 : 16) | 384 | (cVarH.a(z) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = aiMessagingButtonType == AiMessagingButtonType.REFINE_DRAFT ? R.string.messaging_ai_refine_message_button : R.string.messaging_ai_back_to_options_button;
            e.a aVar = e.a.b;
            gu5Var2 = gu5Var;
            b(i3, (i2 << 3) & 65408, gu5Var2, cVarH, aVar, z);
            z2 = z;
            Boolean bool = Boolean.TRUE;
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new p00(2, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, bool, (Function2) objV);
            eVar2 = aVar;
        } else {
            gu5Var2 = gu5Var;
            z2 = z;
            cVarH.D();
            eVar2 = eVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final gu5 gu5Var3 = gu5Var2;
            iVarW.d = new Function2(gu5Var3, eVar2, z2, i) { // from class: l00
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ e c;
                public final /* synthetic */ boolean d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    q00.a(this.a, this.b, this.c, this.d, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final int i, final int i2, final gu5 gu5Var, b bVar, final e eVar, final boolean z) {
        int i3;
        c cVarH = bVar.h(278567287);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.d(R.drawable.ai_messaging_promo_two_stars) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 3072) == 0) {
            i3 |= cVarH.K(eVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i2 & 24576) == 0) {
            i3 |= cVarH.a(z) ? 16384 : 8192;
        }
        if (cVarH.o(i3 & 1, (i3 & 9363) != 9362)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            final ese eseVarB = vc0.b(z ? 0.4f : 1.0f, zd0.d(UiRumDebugListener.DEFAULT_ALPHA, 0, null, 6), "button_alpha", cVarH, 3120, 20);
            e eVarA = f.a(g.h(eVar, 44.0f), "AiMessagingButton");
            fgd fgdVarA = ggd.a(16.0f);
            hza hzaVar = hq1.a;
            long j = o97Var.c.b.a;
            nq1.a(gu5Var, eVarA, !z, fgdVarA, hq1.a(j, 0L, j, 0L, cVarH, 10), new lq1(2.0f, 1.0f, 1.0f, 3.0f), ee3.f(da2.b(o97Var.c.c.b, z ? 0.4f : 0.9f), 1.0f), androidx.compose.foundation.layout.f.a(16.0f, 0.0f, 2), null, bh2.c(108411783, new wu5() { // from class: m00
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((fhd) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        vs0.i iVar = new vs0.i(8.0f, true, new us0(0));
                        float fFloatValue = ((Number) eseVarB.getValue()).floatValue();
                        e.a aVar = e.a.b;
                        e eVarG = ygg.g(aVar, fFloatValue);
                        ehd ehdVarA = chd.a(iVar, c20.a.k, bVar2, 48);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarG);
                        gl2.j.getClass();
                        pm8.a aVar2 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar2);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ehdVarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        ygg.y(bVar2, eVarC, gl2.a.d);
                        vq6.b(z2b.a(R.drawable.ai_messaging_promo_two_stars, 0, bVar2), "", g.n(aVar, 20.0f), da2.i, bVar2, 3504, 0);
                        Integer numValueOf = Integer.valueOf(i);
                        Object objV = bVar2.v();
                        if (objV == b.a.a) {
                            objV = new he(1);
                            bVar2.p(objV);
                        }
                        a.b(numValueOf, null, (Function1) objV, null, "text_animation", null, bh2.c(-2069174219, new o00(o97Var, 0), bVar2), bVar2, 1597824, 42);
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, ((i3 >> 6) & 14) | 805306368, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            cVarH = cVarH;
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: n00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i2 | 1);
                    q00.b(i, iL, gu5Var, (b) obj, eVar, z);
                    return j6g.a;
                }
            };
        }
    }
}
