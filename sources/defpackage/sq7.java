package defpackage;

import com.indeed.android.jobsearch.tare.nav.a;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.mld;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sq7 implements gu5 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sq7(e13 e13Var, e8a e8aVar, ude udeVar, SavedJobsDto savedJobsDto) {
        this.b = savedJobsDto;
        this.c = e13Var;
        this.d = e8aVar;
        this.e = udeVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ztd.a((lr5) obj4, (jt7) obj3, (String) obj2, (kt7) obj);
                break;
            default:
                SavedJobsDto savedJobsDto = (SavedJobsDto) obj4;
                e13 e13Var = (e13) obj3;
                e8a e8aVar = (e8a) obj2;
                ude udeVar = (ude) obj;
                if (!savedJobsDto.isJobExpired()) {
                    u63.Y(e13Var, null, null, new mld.c(e8aVar, savedJobsDto, udeVar, null), 3);
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ sq7(lr5 lr5Var, jt7 jt7Var, String str, kt7 kt7Var, a aVar) {
        this.b = lr5Var;
        this.c = jt7Var;
        this.d = str;
        this.e = kt7Var;
    }
}
