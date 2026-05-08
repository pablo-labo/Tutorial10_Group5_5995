package defpackage;

import com.indeed.android.myjobs.data.model.dto.Event5722DTO;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.kv8;
import defpackage.lx5;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ly implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ly(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                f51 f51Var = (f51) this.b;
                g4a g4aVar = (g4a) this.c;
                String str = (String) obj;
                str.getClass();
                Locale locale = (Locale) g4aVar.getValue();
                f51Var.y(str, locale != null ? locale.getCountry() : null);
                return j6g.a;
            case 1:
                String str2 = (String) this.b;
                SavedJobsDto savedJobsDto = (SavedJobsDto) this.c;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                boolean indeedApplyable = savedJobsDto.getIndeedApplyable();
                boolean zIsJobExpired = savedJobsDto.isJobExpired();
                Event5722DTO event5722DTO = savedJobsDto.getEvent5722DTO();
                ?? B = event5722DTO != null ? wl7.b(event5722DTO.isJobHosted(), Boolean.TRUE) : 0;
                Event5722DTO event5722DTO2 = savedJobsDto.getEvent5722DTO();
                ?? B2 = event5722DTO2 != null ? wl7.b(event5722DTO2.isApplicationImpacted(), Boolean.TRUE) : 0;
                ?? H = w40.h(indeedApplyable ? 1 : 0, "reason=", str2, ",indeedapplyable=", ",jobExpired=");
                uz.i(H, zIsJobExpired ? 1 : 0, ",hosted=", B, ",isEvent5722=");
                H.append(B2);
                String string = H.toString();
                bVar.a("subTabName", "Applied");
                bVar.a("jobKey", savedJobsDto.getJobkey());
                bVar.a("entityData", string);
                bVar.a("encryptedIaAppId", savedJobsDto.getEncryptedIaAppId());
                return j6g.a;
            case 2:
                zv8 zv8Var = (zv8) this.b;
                final g4a g4aVar2 = (g4a) this.c;
                ((m74) obj).getClass();
                uv8 uv8Var = new uv8() { // from class: t6a
                    @Override // defpackage.uv8
                    public final void G(zv8 zv8Var2, kv8.a aVar) {
                        if (aVar == kv8.a.ON_RESUME) {
                            g4aVar2.setValue(Boolean.TRUE);
                        }
                    }
                };
                zv8Var.getLifecycle().a(uv8Var);
                return new iw(1, zv8Var, uv8Var);
            default:
                kt1 kt1Var = (kt1) this.b;
                gzf gzfVar = (gzf) this.c;
                hzf hzfVar = (hzf) obj;
                synchronized (((awd) kt1Var.a)) {
                    try {
                        boolean zF = hzfVar.f();
                        a89 a89Var = (a89) kt1Var.b;
                        if (zF) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return j6g.a;
        }
    }
}
