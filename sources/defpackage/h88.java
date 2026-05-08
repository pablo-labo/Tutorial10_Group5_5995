package defpackage;

import com.indeed.android.myjobs.data.model.AppStatusJob;
import com.indeed.android.myjobs.data.model.SelfReportedStatus;
import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.InviteDto;
import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import com.indeed.android.myjobs.data.model.dto.JobTimestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h88 implements f88 {
    public final gse a;
    public final gse b;
    public final gse c;
    public final gse d;
    public final gse e;
    public final gse f;
    public final gse g;

    public static final class a extends iyf<Map<String, ? extends String>> {
    }

    public static final class b extends iyf<Map<String, ? extends Long>> {
    }

    public static final class c extends iyf<List<? extends JobTimestamp>> {
    }

    public static final class d extends iyf<Map<String, String>> {
    }

    public static final class e extends iyf<Map<String, Long>> {
    }

    public static final class f extends iyf<List<JobTimestamp>> {
    }

    public h88() {
        zr4 zr4Var = zr4.a;
        this.a = hh2.e(zr4Var);
        this.b = hh2.e(zr4Var);
        this.c = hh2.e(zr4Var);
        this.d = hh2.e(zr4Var);
        this.e = hh2.e(zr4Var);
        this.f = hh2.e(zr4Var);
        this.g = hh2.e(0L);
    }

    public static Set G() {
        String strB = ((kq7) cr8.p(kq7.class)).b("myjobs_declined_invites", "declined_invite_ids", "");
        String str = strB != null ? strB : "";
        if (str.length() == 0) {
            return is4.a;
        }
        List listK0 = zve.k0(str, new String[]{","});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK0) {
            if (!zve.U((String) obj)) {
                arrayList.add(obj);
            }
        }
        return z92.E1(arrayList);
    }

    @Override // defpackage.f88
    public final void A(List<AppStatusJob> list) {
        gse gseVar = this.d;
        gseVar.getClass();
        gseVar.m(null, list);
    }

    @Override // defpackage.f88
    public final void B(ArrayList arrayList) {
        gse gseVar = this.e;
        gseVar.getClass();
        gseVar.m(null, arrayList);
    }

    @Override // defpackage.f88
    public final void C() {
        ((kq7) cr8.p(kq7.class)).f("myjobs_red_dot_status", "myjobs_employer_viewed", "{}");
    }

    @Override // defpackage.f88
    public final void D(List<InvitedJobDto> list) {
        list.getClass();
        gse gseVar = this.f;
        gseVar.getClass();
        gseVar.m(null, list);
    }

    @Override // defpackage.f88
    public final void E(String str, String str2) {
        Object next;
        str.getClass();
        gse gseVar = this.d;
        Iterator it = ((Iterable) gseVar.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (wl7.b(((AppStatusJob) next).getJobKey(), str)) {
                    break;
                }
            }
        }
        AppStatusJob appStatusJob = (AppStatusJob) next;
        if (appStatusJob != null) {
            ArrayList arrayListB1 = z92.B1((Collection) gseVar.getValue());
            arrayListB1.remove(appStatusJob);
            gseVar.getClass();
            gseVar.m(null, arrayListB1);
            AppStatusJob appStatusJobCopy$default = AppStatusJob.copy$default(appStatusJob, null, null, null, null, false, false, false, false, null, null, appStatusJob.getStatuses().copy(appStatusJob.getStatuses().getCandidateStatus(), new SelfReportedStatus(str2, System.currentTimeMillis()), appStatusJob.getStatuses().getEmployerJobStatus(), new UserJobStatus("POST_APPLY", System.currentTimeMillis())), 0L, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, 268434431, null);
            gse gseVar2 = this.b;
            ArrayList arrayListB12 = z92.B1((Collection) gseVar2.getValue());
            arrayListB12.add(appStatusJobCopy$default);
            gseVar2.getClass();
            gseVar2.m(null, arrayListB12);
        }
    }

    @Override // defpackage.f88
    public final Map<String, String> F() {
        kq7 kq7Var = (kq7) cr8.p(kq7.class);
        ae6 ae6Var = new ae6();
        String strB = kq7Var.b("myjobs_red_dot_status", "myjobs_employer_viewed", "{}");
        Object objB = ae6Var.b(strB != null ? strB : "{}", new a().b);
        objB.getClass();
        return (Map) objB;
    }

    @Override // defpackage.f88
    public final void a(String str) {
        Object next;
        str.getClass();
        gse gseVar = this.c;
        Iterator it = ((Iterable) gseVar.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (wl7.b(((AppStatusJob) next).getJobKey(), str)) {
                    break;
                }
            }
        }
        AppStatusJob appStatusJob = (AppStatusJob) next;
        if (appStatusJob != null) {
            ArrayList arrayListB1 = z92.B1((Collection) gseVar.getValue());
            arrayListB1.remove(appStatusJob);
            gseVar.getClass();
            gseVar.m(null, arrayListB1);
            UserJobStatus userJobStatus = appStatusJob.getStatuses().getUserJobStatus();
            AppStatusJob appStatusJobCopy$default = AppStatusJob.copy$default(appStatusJob, null, null, null, null, false, false, false, false, null, null, appStatusJob.getStatuses().copy(appStatusJob.getStatuses().getCandidateStatus(), appStatusJob.getStatuses().getSelfReportedStatus(), appStatusJob.getStatuses().getEmployerJobStatus(), new UserJobStatus("POST_APPLY", userJobStatus != null ? userJobStatus.getTimestamp() : System.currentTimeMillis())), 0L, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, 268434431, null);
            gse gseVar2 = this.b;
            ArrayList arrayListB12 = z92.B1((Collection) gseVar2.getValue());
            arrayListB12.add(appStatusJobCopy$default);
            gseVar2.getClass();
            gseVar2.m(null, arrayListB12);
        }
    }

    @Override // defpackage.f88
    public final rqc b() {
        return wg2.j(this.b);
    }

    @Override // defpackage.f88
    public final void c(List<AppStatusJob> list) {
        gse gseVar = this.a;
        gseVar.getClass();
        gseVar.m(null, list);
    }

    @Override // defpackage.f88
    public final void d() {
        ((kq7) cr8.p(kq7.class)).f("myjobs_invitation_viewed_status", "invitation_viewed_timestamps", "{}");
    }

    @Override // defpackage.f88
    public final List<JobTimestamp> e(String str) {
        List<JobTimestamp> list = (List) new ae6().b(((kq7) cr8.p(kq7.class)).b("myjobs_JobStatusPrefs", str, "[]"), new c().b);
        return list == null ? zr4.a : list;
    }

    @Override // defpackage.f88
    public final void f() {
        gse gseVar = this.c;
        gseVar.getClass();
        gseVar.m(null, zr4.a);
    }

    @Override // defpackage.f88
    public final Map<String, Long> g() {
        kq7 kq7Var = (kq7) cr8.p(kq7.class);
        ae6 ae6Var = new ae6();
        String strB = kq7Var.b("myjobs_invitation_viewed_status", "invitation_viewed_timestamps", "{}");
        Object objB = ae6Var.b(strB != null ? strB : "{}", new b().b);
        objB.getClass();
        return (Map) objB;
    }

    @Override // defpackage.f88
    public final void h(List<AppStatusJob> list) {
        gse gseVar = this.b;
        gseVar.getClass();
        gseVar.m(null, list);
    }

    @Override // defpackage.f88
    public final rqc i() {
        return wg2.j(this.c);
    }

    @Override // defpackage.f88
    public final void j(String str) {
        Object next;
        Object next2;
        str.getClass();
        gse gseVar = this.b;
        Iterator it = ((Iterable) gseVar.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (wl7.b(((AppStatusJob) next).getJobKey(), str)) {
                    break;
                }
            }
        }
        AppStatusJob appStatusJob = (AppStatusJob) next;
        gse gseVar2 = this.c;
        if (appStatusJob != null) {
            ArrayList arrayListB1 = z92.B1((Collection) gseVar.getValue());
            arrayListB1.remove(appStatusJob);
            gseVar.getClass();
            gseVar.m(null, arrayListB1);
            AppStatusJob appStatusJobCopy$default = AppStatusJob.copy$default(appStatusJob, null, null, null, null, false, false, false, false, null, null, appStatusJob.getStatuses().copy(appStatusJob.getStatuses().getCandidateStatus(), appStatusJob.getStatuses().getSelfReportedStatus(), appStatusJob.getStatuses().getEmployerJobStatus(), new UserJobStatus("ARCHIVED", System.currentTimeMillis())), 0L, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, 268434431, null);
            ArrayList arrayListB12 = z92.B1((Collection) gseVar2.getValue());
            arrayListB12.add(appStatusJobCopy$default);
            gseVar2.getClass();
            gseVar2.m(null, arrayListB12);
            return;
        }
        gse gseVar3 = this.d;
        Iterator it2 = ((Iterable) gseVar3.getValue()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (wl7.b(((AppStatusJob) next2).getJobKey(), str)) {
                    break;
                }
            }
        }
        AppStatusJob appStatusJob2 = (AppStatusJob) next2;
        if (appStatusJob2 == null) {
            ArrayList arrayList = lz2.a;
            lz2.b("JobsLocalRepositoryImpl", l5.m("Cannot find job with jobkey ", str, " in visited jobs"), false, new Exception(l5.m("Cannot find job with jobkey ", str, " in visited jobs")));
            return;
        }
        ArrayList arrayListB13 = z92.B1((Collection) gseVar3.getValue());
        arrayListB13.remove(appStatusJob2);
        gseVar3.m(null, arrayListB13);
        AppStatusJob appStatusJobCopy$default2 = AppStatusJob.copy$default(appStatusJob2, null, null, null, null, false, false, false, false, null, null, appStatusJob2.getStatuses().copy(appStatusJob2.getStatuses().getCandidateStatus(), appStatusJob2.getStatuses().getSelfReportedStatus(), appStatusJob2.getStatuses().getEmployerJobStatus(), new UserJobStatus("ARCHIVED", System.currentTimeMillis())), 0L, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, 268434431, null);
        ArrayList arrayListB14 = z92.B1((Collection) gseVar2.getValue());
        arrayListB14.add(appStatusJobCopy$default2);
        gseVar2.m(null, arrayListB14);
    }

    @Override // defpackage.f88
    public final void k(String str, String str2) {
        str.getClass();
        str2.getClass();
        E(str, "");
        gse gseVar = this.b;
        ArrayList arrayListB1 = z92.B1((Collection) gseVar.getValue());
        Iterator it = arrayListB1.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (wl7.b(((AppStatusJob) it.next()).getJobKey(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            SelfReportedStatus selfReportedStatus = ((AppStatusJob) arrayListB1.get(i)).getStatuses().getSelfReportedStatus();
            arrayListB1.set(i, AppStatusJob.copy$default(AppStatusJob.copy$default((AppStatusJob) arrayListB1.get(i), null, null, null, null, false, false, false, false, null, null, ((AppStatusJob) arrayListB1.get(i)).getStatuses().copy(((AppStatusJob) arrayListB1.get(i)).getStatuses().getCandidateStatus(), new SelfReportedStatus(str2, System.currentTimeMillis()), ((AppStatusJob) arrayListB1.get(i)).getStatuses().getEmployerJobStatus(), ((AppStatusJob) arrayListB1.get(i)).getStatuses().getUserJobStatus()), 0L, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, 268434431, null), null, null, null, null, false, false, false, false, null, null, null, 0L, false, false, false, false, null, null, null, null, null, null, null, ((AppStatusJob) arrayListB1.get(i)).getSortingTimeStamp() != null ? ((AppStatusJob) arrayListB1.get(i)).getSortingTimeStamp() : Long.valueOf(selfReportedStatus != null ? selfReportedStatus.getTimestamp() : 0L), null, null, null, null, 260046847, null));
            gseVar.getClass();
            gseVar.m(null, arrayListB1);
        }
    }

    @Override // defpackage.f88
    public final void l(String str, String str2) {
        str.getClass();
        kq7 kq7Var = (kq7) cr8.p(kq7.class);
        List arrayList = (List) new ae6().b(kq7Var.b("myjobs_JobStatusPrefs", str2, "[]"), new f().b);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (wl7.b(((JobTimestamp) it.next()).getJobKey(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            arrayList.set(i, new JobTimestamp(str, System.currentTimeMillis()));
        } else {
            arrayList.add(new JobTimestamp(str, System.currentTimeMillis()));
        }
        String strF = new ae6().f(arrayList);
        if (!str2.equals("myjobs_crossJobsTimeStamp")) {
            gse gseVar = this.d;
            Iterable iterable = (Iterable) gseVar.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                if (!str.equals(((AppStatusJob) obj).getJobKey())) {
                    arrayList2.add(obj);
                }
            }
            gseVar.getClass();
            gseVar.m(null, arrayList2);
        }
        strF.getClass();
        kq7Var.f("myjobs_JobStatusPrefs", str2, strF);
    }

    @Override // defpackage.f88
    public final void m(long j, String str) {
        str.getClass();
        kq7 kq7Var = (kq7) cr8.p(kq7.class);
        ae6 ae6Var = new ae6();
        String strB = kq7Var.b("myjobs_invitation_viewed_status", "invitation_viewed_timestamps", "{}");
        Object objB = ae6Var.b(strB != null ? strB : "{}", new e().b);
        objB.getClass();
        Map map = (Map) objB;
        map.put(str, Long.valueOf(j));
        String strF = ae6Var.f(map);
        strF.getClass();
        kq7Var.f("myjobs_invitation_viewed_status", "invitation_viewed_timestamps", strF);
    }

    @Override // defpackage.f88
    public final rqc n() {
        return wg2.j(this.e);
    }

    @Override // defpackage.f88
    public final rqc o() {
        return wg2.j(this.a);
    }

    @Override // defpackage.f88
    public final void p(String str) {
        str.getClass();
        gse gseVar = this.f;
        Iterable<InvitedJobDto> iterable = (Iterable) gseVar.getValue();
        ArrayList arrayList = new ArrayList(t92.r0(iterable, 10));
        for (InvitedJobDto invitedJobDtoCopy$default : iterable) {
            if (wl7.b(invitedJobDtoCopy$default.getInvite().getId(), str)) {
                invitedJobDtoCopy$default = InvitedJobDto.copy$default(invitedJobDtoCopy$default, null, InviteDto.copy$default(invitedJobDtoCopy$default.getInvite(), null, "INTERESTED", null, null, null, null, null, null, null, 509, null), null, 5, null);
            }
            arrayList.add(invitedJobDtoCopy$default);
        }
        gseVar.getClass();
        gseVar.m(null, arrayList);
    }

    @Override // defpackage.f88
    public final void q(String str) {
        Object next;
        str.getClass();
        gse gseVar = this.a;
        Iterator it = ((Iterable) gseVar.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (wl7.b(((AppStatusJob) next).getJobKey(), str)) {
                    break;
                }
            }
        }
        AppStatusJob appStatusJob = (AppStatusJob) next;
        if (appStatusJob != null) {
            ArrayList arrayListB1 = z92.B1((Collection) gseVar.getValue());
            arrayListB1.remove(appStatusJob);
            gseVar.getClass();
            gseVar.m(null, arrayListB1);
            AppStatusJob appStatusJobCopy$default = AppStatusJob.copy$default(appStatusJob, null, null, null, null, false, false, false, false, null, null, appStatusJob.getStatuses().copy(appStatusJob.getStatuses().getCandidateStatus(), new SelfReportedStatus("APPLIED", System.currentTimeMillis()), appStatusJob.getStatuses().getEmployerJobStatus(), new UserJobStatus("POST_APPLY", System.currentTimeMillis())), 0L, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, 268434431, null);
            gse gseVar2 = this.b;
            ArrayList arrayListB12 = z92.B1((Collection) gseVar2.getValue());
            arrayListB12.add(appStatusJobCopy$default);
            gseVar2.getClass();
            gseVar2.m(null, arrayListB12);
        }
    }

    @Override // defpackage.f88
    public final tk5 r() {
        return new tk5(wg2.j(this.f), wg2.j(this.g), new g88(this, null));
    }

    @Override // defpackage.f88
    public final void s(List<AppStatusJob> list) {
        gse gseVar = this.c;
        gseVar.getClass();
        gseVar.m(null, list);
    }

    @Override // defpackage.f88
    public final void t(String str, String str2) {
        str.getClass();
        str2.getClass();
        kq7 kq7Var = (kq7) cr8.p(kq7.class);
        ae6 ae6Var = new ae6();
        String strB = kq7Var.b("myjobs_red_dot_status", "myjobs_employer_viewed", "{}");
        Object objB = ae6Var.b(strB != null ? strB : "{}", new d().b);
        objB.getClass();
        Map map = (Map) objB;
        map.put(str, str2);
        String strF = ae6Var.f(map);
        strF.getClass();
        kq7Var.f("myjobs_red_dot_status", "myjobs_employer_viewed", strF);
    }

    @Override // defpackage.f88
    public final void u(String str) {
        ((kq7) cr8.p(kq7.class)).f("myjobs_JobStatusPrefs", str, "[]");
    }

    @Override // defpackage.f88
    public final void v(String str) {
        str.getClass();
        kq7 kq7Var = (kq7) cr8.p(kq7.class);
        Set setD1 = z92.D1(G());
        setD1.add(str);
        kq7Var.f("myjobs_declined_invites", "declined_invite_ids", z92.W0(setD1, ",", null, null, null, 62));
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        gse gseVar = this.g;
        gseVar.getClass();
        gseVar.m(null, lValueOf);
    }

    @Override // defpackage.f88
    public final void w() {
        gse gseVar = this.b;
        gseVar.getClass();
        gseVar.m(null, zr4.a);
    }

    @Override // defpackage.f88
    public final void x() {
        gse gseVar = this.a;
        gseVar.getClass();
        gseVar.m(null, zr4.a);
    }

    @Override // defpackage.f88
    public final void y(String str) {
        Object next;
        str.getClass();
        gse gseVar = this.b;
        Iterator it = ((Iterable) gseVar.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (wl7.b(((AppStatusJob) next).getJobKey(), str)) {
                    break;
                }
            }
        }
        AppStatusJob appStatusJob = (AppStatusJob) next;
        if (appStatusJob != null) {
            ArrayList arrayListB1 = z92.B1((Collection) gseVar.getValue());
            arrayListB1.remove(appStatusJob);
            gseVar.getClass();
            gseVar.m(null, arrayListB1);
            AppStatusJob appStatusJobCopy$default = AppStatusJob.copy$default(appStatusJob, null, null, null, null, false, false, false, false, null, null, appStatusJob.getStatuses().copy(appStatusJob.getStatuses().getCandidateStatus(), null, appStatusJob.getStatuses().getEmployerJobStatus(), new UserJobStatus("SAVED", System.currentTimeMillis())), 0L, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, 268434431, null);
            gse gseVar2 = this.a;
            ArrayList arrayListB12 = z92.B1((Collection) gseVar2.getValue());
            arrayListB12.add(appStatusJobCopy$default);
            gseVar2.getClass();
            gseVar2.m(null, arrayListB12);
        }
    }

    @Override // defpackage.f88
    public final rqc z() {
        return wg2.j(this.d);
    }
}
