package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.messaging.data.events.EventRecord;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class hj2 {
    public static final ah2 a = new ah2(-982385705, new gh2(2), false);
    public static final ah2 b = new ah2(-2116621775, new em0(1), false);
    public static final ah2 c = new ah2(1606056584, new fm0(3), false);
    public static final ah2 d = new ah2(1403258314, new gm0(2, (byte) 0), false);

    public static final class a implements Function2<b, Integer, j6g> {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(b bVar, Integer num) {
            b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                x1e x1eVar = new x1e(u63.Z(new EventRecord.Attachment("tmp-3", "Very long file name is trimmed.jpeg", "jpeg", EventRecord.AttachmentSentStatus.SUCCESS, null, null, 48, null)), "Hello,\n\nthis is a test response", false, 67108829);
                Object objV = bVar2.v();
                b.a.C0020a c0020a = b.a.a;
                if (objV == c0020a) {
                    objV = new nf(5);
                    bVar2.p(objV);
                }
                Function1 function1 = (Function1) objV;
                Object objV2 = bVar2.v();
                if (objV2 == c0020a) {
                    objV2 = new cn0(3);
                    bVar2.p(objV2);
                }
                gu5 gu5Var = (gu5) objV2;
                Object objV3 = bVar2.v();
                if (objV3 == c0020a) {
                    objV3 = new oz0(3);
                    bVar2.p(objV3);
                }
                gu5 gu5Var2 = (gu5) objV3;
                Object objV4 = bVar2.v();
                if (objV4 == c0020a) {
                    objV4 = new iq0(3);
                    bVar2.p(objV4);
                }
                Function1 function12 = (Function1) objV4;
                Object objV5 = bVar2.v();
                if (objV5 == c0020a) {
                    objV5 = new vg(5);
                    bVar2.p(objV5);
                }
                hp9.d(x1eVar, function1, gu5Var, gu5Var2, function12, (Function1) objV5, false, null, bVar2, 224688, 192);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    static {
        new ah2(-107711651, a.a, false);
    }
}
