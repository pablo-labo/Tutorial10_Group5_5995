package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.messaging.data.conversations.InterviewLinkParams;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.d4f;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class h4f {

    public static final /* synthetic */ class a extends qv5 implements Function2<InterviewLinkParams, FragmentManager, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(InterviewLinkParams interviewLinkParams, FragmentManager fragmentManager) {
            InterviewLinkParams interviewLinkParams2 = interviewLinkParams;
            FragmentManager fragmentManager2 = fragmentManager;
            interviewLinkParams2.getClass();
            fragmentManager2.getClass();
            y1e y1eVar = (y1e) this.receiver;
            y1eVar.getClass();
            u63.Y(ee3.p(y1eVar), null, null, new h2e(y1eVar, interviewLinkParams2, fragmentManager2, null), 3);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.indeed.android.messaging.data.events.EventRecord.TimelineModule r22, androidx.fragment.app.FragmentManager r23, defpackage.gu5<defpackage.j6g> r24, defpackage.y1e r25, java.lang.String r26, androidx.compose.runtime.b r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h4f.a(com.indeed.android.messaging.data.events.EventRecord$TimelineModule, androidx.fragment.app.FragmentManager, gu5, y1e, java.lang.String, androidx.compose.runtime.b, int, int):void");
    }

    public static final void b(EventRecord.TimelineModule timelineModule, FragmentManager fragmentManager, Function2 function2, gu5 gu5Var, String str, b bVar, int i) {
        int i2;
        d4f d4fVar;
        lu2 lu2Var;
        g4a g4aVar;
        int i3;
        timelineModule.getClass();
        function2.getClass();
        c cVarH = bVar.h(388639908);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(timelineModule) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(fragmentManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.K(str) ? 16384 : 8192;
        }
        int i4 = i2;
        if (cVarH.o(i4 & 1, (i4 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new lz(21);
                cVarH.p(objV);
            }
            g4a g4aVar2 = (g4a) ypd.M(objArr, (gu5) objV, cVarH);
            try {
                String telContent = timelineModule.getTelContent();
                if (wl7.b(str, "myjobs-invitations") && wl7.b(timelineModule.getTimelineModuleType(), "RESUME_CONTACT_INITIATED")) {
                    telContent = new pxc("([?&])source=tel(?=(&|$|[\"'\\s]))").f(telContent, new hu(14));
                }
                ra8 ra8Var = le4.a;
                telContent.getClass();
                ra8 ra8Var2 = le4.a;
                ra8Var2.getClass();
                d4fVar = (d4f) ra8Var2.c(d4f.Companion.serializer(), telContent);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.c("TELEvent", bg.e(e, "Error parsing JSON: "), false, null, 12);
                d4fVar = null;
            }
            if (d4fVar != null) {
                cVarH.L(-1258922177);
                String timelineModuleType = timelineModule.getTimelineModuleType();
                boolean zX = ((i4 & 896) == 256) | cVarH.x(fragmentManager) | ((i4 & 7168) == 2048);
                Object objV2 = cVarH.v();
                if (zX || objV2 == c0020a) {
                    objV2 = new xx4(2, fragmentManager, function2, gu5Var);
                    cVarH.p(objV2);
                }
                Function1 function1 = (Function1) objV2;
                boolean zK = cVarH.K(g4aVar2);
                Object objV3 = cVarH.v();
                if (zK || objV3 == c0020a) {
                    i3 = 4;
                    objV3 = new vd(4, g4aVar2);
                    cVarH.p(objV3);
                } else {
                    i3 = 4;
                }
                Function1 function12 = (Function1) objV3;
                boolean z = (i4 & 14) == i3;
                Object objV4 = cVarH.v();
                if (z || objV4 == c0020a) {
                    objV4 = new ma(timelineModule, 19);
                    cVarH.p(objV4);
                }
                d4f.a aVar = d4f.Companion;
                g4aVar = g4aVar2;
                lu2Var = null;
                le4.a(d4fVar, timelineModuleType, function1, function12, (Function1) objV4, cVarH, 0);
                cVarH.U(false);
            } else {
                lu2Var = null;
                g4aVar = g4aVar2;
                cVarH.L(-1258208557);
                cVarH.U(false);
            }
            j6g j6gVar = j6g.a;
            boolean zK2 = cVarH.K(g4aVar);
            Object objV5 = cVarH.v();
            if (zK2 || objV5 == c0020a) {
                objV5 = new i4f(g4aVar, lu2Var);
                cVarH.p(objV5);
            }
            to4.d(cVarH, j6gVar, (Function2) objV5);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gv0(timelineModule, fragmentManager, function2, gu5Var, str, i);
        }
    }
}
