package com.wlappdebug;

import com.wlproctor.common.PayloadSpecification;
import defpackage.fif;
import defpackage.j6g;
import defpackage.mj8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
    final /* synthetic */ PayloadSpecification $payloadSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(PayloadSpecification payloadSpecification) {
        super(2);
        this.$payloadSpec = payloadSpecification;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
        androidx.compose.runtime.b bVar2 = bVar;
        if ((num.intValue() & 11) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            String str = "JSON e.g. {\"a\": 12, \"b\": \"c\"}";
            switch (this.$payloadSpec.a.ordinal()) {
                case 0:
                    str = "single number e.g. 1.2";
                    fif.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 131070);
                    break;
                case 1:
                    str = "comma-separated e.g. 1.2,-3.4";
                    fif.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 131070);
                    break;
                case 2:
                    str = "single number e.g. 200";
                    fif.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 131070);
                    break;
                case 3:
                    str = "comma-separated e.g. 55,66";
                    fif.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 131070);
                    break;
                case 4:
                    str = "surround with quotes e.g. \"abc\"";
                    fif.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 131070);
                    break;
                case 5:
                    str = "comma-separated e.g. \"a\",\"bc\"";
                    fif.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 131070);
                    break;
                case 6:
                case 7:
                    fif.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 131070);
                    break;
                default:
                    defpackage.l.g();
                    return null;
            }
        }
        return j6g.a;
    }
}
