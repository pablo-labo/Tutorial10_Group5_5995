package defpackage;

import androidx.compose.runtime.b;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.events.EventRecord;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gs0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gs0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String strX;
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ks0.a((e8a) obj4, (ss8) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                nx7.a((vnd) obj4, (Function1) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 2:
                ArrayList arrayList = (ArrayList) obj4;
                o97 o97Var = (o97) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (arrayList.size() == 1 && ((EventRecord.Attachment) arrayList.get(0)).getFileType() == EventRecord.AttachmentFileType.PHOTO) {
                        strX = l.e(bVar, -445575933, R.string.messaging_attachment_alert_single_photo_failed, bVar);
                    } else {
                        bVar.L(-445449980);
                        strX = ak2.x(R.plurals.messaging_attachment_alert_multiple_files_failed, arrayList.size(), new Object[]{Integer.valueOf(arrayList.size())}, bVar);
                        bVar.F();
                    }
                    fif.b(strX, null, 0L, o97Var.e.g, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar, 0, 0, 131062);
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$16((Promise) obj4, (RNProfileFormsModule) obj3, (ps7) obj, (ks7) obj2);
        }
    }

    public /* synthetic */ gs0(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
