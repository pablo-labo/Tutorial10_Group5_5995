package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class ei2 {
    public static final ah2 a = new ah2(636288403, b.a, false);
    public static final ah2 b = new ah2(-1357803046, a.a, false);

    public static final class a implements yu5<kdf, zcf, gu5<? extends sl8>, androidx.compose.runtime.b, Integer, j6g> {
        public static final a a = new a();

        @Override // defpackage.yu5
        public final j6g t(kdf kdfVar, zcf zcfVar, gu5<? extends sl8> gu5Var, androidx.compose.runtime.b bVar, Integer num) {
            int i;
            kdf kdfVar2 = kdfVar;
            zcf zcfVar2 = zcfVar;
            gu5<? extends sl8> gu5Var2 = gu5Var;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                i = ((iIntValue & 8) == 0 ? bVar2.K(kdfVar2) : bVar2.x(kdfVar2) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i |= (iIntValue & 64) == 0 ? bVar2.K(zcfVar2) : bVar2.x(zcfVar2) ? 32 : 16;
            }
            if ((iIntValue & 384) == 0) {
                i |= bVar2.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            if (bVar2.o(i & 1, (i & 1171) != 1170)) {
                yq3.c(kdfVar2, zcfVar2, gu5Var2, bVar2, i & 1022);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class b implements yu5<kdf, zcf, gu5<? extends sl8>, androidx.compose.runtime.b, Integer, j6g> {
        public static final b a = new b();

        @Override // defpackage.yu5
        public final j6g t(kdf kdfVar, zcf zcfVar, gu5<? extends sl8> gu5Var, androidx.compose.runtime.b bVar, Integer num) {
            int i;
            kdf kdfVar2 = kdfVar;
            zcf zcfVar2 = zcfVar;
            gu5<? extends sl8> gu5Var2 = gu5Var;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                i = ((iIntValue & 8) == 0 ? bVar2.K(kdfVar2) : bVar2.x(kdfVar2) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i |= (iIntValue & 64) == 0 ? bVar2.K(zcfVar2) : bVar2.x(zcfVar2) ? 32 : 16;
            }
            if ((iIntValue & 384) == 0) {
                i |= bVar2.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            if (bVar2.o(i & 1, (i & 1171) != 1170)) {
                yq3.c(kdfVar2, zcfVar2, gu5Var2, bVar2, i & 1022);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }
}
