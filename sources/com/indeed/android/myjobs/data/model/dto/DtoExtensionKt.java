package com.indeed.android.myjobs.data.model.dto;

import com.indeed.android.myjobs.data.model.Actions;
import com.indeed.android.myjobs.data.model.BrandedAdsApiResponse;
import com.indeed.android.myjobs.data.model.Interview;
import com.indeed.android.myjobs.data.model.JobTaxonomyOccupation;
import com.indeed.android.myjobs.data.model.TimeSlot;
import defpackage.he3;
import defpackage.lz2;
import defpackage.nl7;
import defpackage.p5a;
import defpackage.t92;
import defpackage.w40;
import defpackage.z92;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001c\u001a\u00020\u001b*\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010 \u001a\u00020\u001f*\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u0011\u0010$\u001a\u00020#*\u00020\"¢\u0006\u0004\b$\u0010%\u001a\u0011\u0010(\u001a\u00020'*\u00020&¢\u0006\u0004\b(\u0010)\u001a\u0011\u0010,\u001a\u00020+*\u00020*¢\u0006\u0004\b,\u0010-\u001a\u0011\u00100\u001a\u00020/*\u00020.¢\u0006\u0004\b0\u00101\u001a\u0011\u00104\u001a\u000203*\u000202¢\u0006\u0004\b4\u00105\u001a\u0011\u00108\u001a\u000207*\u000206¢\u0006\u0004\b8\u00109\"\u0014\u0010:\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/indeed/android/myjobs/data/model/BrandedAdsApiResponse;", "Lcom/indeed/android/myjobs/data/model/dto/BrandedAdsDto;", "toBrandedAdsDto", "(Lcom/indeed/android/myjobs/data/model/BrandedAdsApiResponse;)Lcom/indeed/android/myjobs/data/model/dto/BrandedAdsDto;", "Lcom/indeed/android/myjobs/data/model/AppStatusJob;", "Lcom/indeed/android/myjobs/data/model/dto/SavedJobsDto;", "toSavedJobDTO", "(Lcom/indeed/android/myjobs/data/model/AppStatusJob;)Lcom/indeed/android/myjobs/data/model/dto/SavedJobsDto;", "Lcom/indeed/android/myjobs/data/model/Interview;", "Lcom/indeed/android/myjobs/data/model/dto/InterviewJobsDto;", "toInterviewJobDto", "(Lcom/indeed/android/myjobs/data/model/Interview;)Lcom/indeed/android/myjobs/data/model/dto/InterviewJobsDto;", "", "formatType", "Lnl7;", "getInterviewFormatType", "(Ljava/lang/String;)Lnl7;", "", "value", "", "convertToLong", "(Ljava/lang/Object;)J", "Lp5a$d;", "Lcom/indeed/android/myjobs/data/model/dto/EmployerInvitationDto;", "toEmployerInvitationDto", "(Lp5a$d;)Lcom/indeed/android/myjobs/data/model/dto/EmployerInvitationDto;", "Lp5a$h;", "Lcom/indeed/android/myjobs/data/model/dto/InvitedJobDto;", "toInvitedJobDto", "(Lp5a$h;)Lcom/indeed/android/myjobs/data/model/dto/InvitedJobDto;", "Lp5a$i;", "Lcom/indeed/android/myjobs/data/model/dto/JobDetailsDto;", "toJobDetailsDto", "(Lp5a$i;)Lcom/indeed/android/myjobs/data/model/dto/JobDetailsDto;", "Lp5a$j;", "Lcom/indeed/android/myjobs/data/model/dto/JobTypeDto;", "toJobTypeDto", "(Lp5a$j;)Lcom/indeed/android/myjobs/data/model/dto/JobTypeDto;", "Lp5a$g;", "Lcom/indeed/android/myjobs/data/model/dto/InviteDto;", "toInviteDto", "(Lp5a$g;)Lcom/indeed/android/myjobs/data/model/dto/InviteDto;", "Lp5a$m;", "Lcom/indeed/android/myjobs/data/model/dto/RecipientDto;", "toRecipientDto", "(Lp5a$m;)Lcom/indeed/android/myjobs/data/model/dto/RecipientDto;", "Lp5a$n;", "Lcom/indeed/android/myjobs/data/model/dto/SenderDto;", "toSenderDto", "(Lp5a$n;)Lcom/indeed/android/myjobs/data/model/dto/SenderDto;", "Lp5a$c;", "Lcom/indeed/android/myjobs/data/model/dto/CtaButtonDto;", "toCtaButtonDto", "(Lp5a$c;)Lcom/indeed/android/myjobs/data/model/dto/CtaButtonDto;", "Lp5a$b;", "Lcom/indeed/android/myjobs/data/model/dto/ConversationDto;", "toConversationDto", "(Lp5a$b;)Lcom/indeed/android/myjobs/data/model/dto/ConversationDto;", "TAG", "Ljava/lang/String;", "myjobs_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class DtoExtensionKt {
    private static final String TAG = "DTOExtension";

    public static final long convertToLong(Object obj) {
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        ArrayList arrayList = lz2.a;
        w40.n("Unable to convert timestamp into long", TAG, "Unable to convert timestamp into long", false);
        return 0L;
    }

    public static final nl7 getInterviewFormatType(String str) {
        str.getClass();
        if (he3.a.contains(str)) {
            return nl7.b;
        }
        if (he3.d.contains(str)) {
            return nl7.a;
        }
        if (he3.b.contains(str) || he3.c.contains(str)) {
            return nl7.c;
        }
        ArrayList arrayList = lz2.a;
        w40.n("Unexpected interview format type returned", TAG, "Unexpected interview format type returned ".concat(str), false);
        return nl7.e;
    }

    public static final BrandedAdsDto toBrandedAdsDto(BrandedAdsApiResponse brandedAdsApiResponse) {
        brandedAdsApiResponse.getClass();
        return new BrandedAdsDto(brandedAdsApiResponse.getCreativeKey(), brandedAdsApiResponse.getMobtk(), brandedAdsApiResponse.getFccKey(), brandedAdsApiResponse.getFlowPage(), brandedAdsApiResponse.getFlowType(), brandedAdsApiResponse.getImageUrl(), brandedAdsApiResponse.getLogoUrl(), brandedAdsApiResponse.getGotoUrl(), brandedAdsApiResponse.getGotoText(), brandedAdsApiResponse.getTrackingPixel(), brandedAdsApiResponse.getCompanyName(), brandedAdsApiResponse.getCompanyDescription(), brandedAdsApiResponse.getCompanyRating(), brandedAdsApiResponse.getNumReviews(), brandedAdsApiResponse.getAdvParentCompanyName(), brandedAdsApiResponse.getTargetingCriteria(), brandedAdsApiResponse.getLogLabel());
    }

    public static final ConversationDto toConversationDto(p5a.b bVar) {
        bVar.getClass();
        return new ConversationDto(bVar.a, bVar.b, bVar.c, bVar.d);
    }

    public static final CtaButtonDto toCtaButtonDto(p5a.c cVar) {
        cVar.getClass();
        return new CtaButtonDto(cVar.a, cVar.b.name(), cVar.c, cVar.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [zr4] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public static final EmployerInvitationDto toEmployerInvitationDto(p5a.d dVar) {
        ?? arrayList;
        dVar.getClass();
        p5a.l lVar = dVar.a;
        if (lVar != null) {
            ArrayList<p5a.h> arrayList2 = lVar.a;
            arrayList = new ArrayList();
            for (p5a.h hVar : arrayList2) {
                InvitedJobDto invitedJobDto = hVar.a != null ? toInvitedJobDto(hVar) : null;
                if (invitedJobDto != null) {
                    arrayList.add(invitedJobDto);
                }
            }
        } else {
            arrayList = zr4.a;
        }
        return new EmployerInvitationDto(arrayList);
    }

    public static final InterviewJobsDto toInterviewJobDto(Interview interview) {
        List<String> mostLikelySuids;
        TimeSlot timeSlot;
        TimeSlot timeSlot2;
        TimeSlot timeSlot3;
        interview.getClass();
        String jobKey = interview.getJobDetails().getJobKey();
        String title = interview.getJobDetails().getTitle();
        String company = interview.getJobDetails().getCompany();
        String location = interview.getJobDetails().getLocation();
        List<TimeSlot> timeSlots = interview.getTimeSlots();
        long timeEnd = 0;
        long timeStart = (timeSlots == null || (timeSlot3 = (TimeSlot) z92.Q0(timeSlots)) == null) ? 0L : timeSlot3.getTimeStart();
        Actions actions = interview.getActions();
        String linkToCancel = actions != null ? actions.getLinkToCancel() : null;
        Actions actions2 = interview.getActions();
        String linkToReschedule = actions2 != null ? actions2.getLinkToReschedule() : null;
        String linkToInterview = interview.getMetadata().getLinkToInterview();
        String status = interview.getStatus();
        List<TimeSlot> timeSlots2 = interview.getTimeSlots();
        long timeStart2 = (timeSlots2 == null || (timeSlot2 = (TimeSlot) z92.Q0(timeSlots2)) == null) ? 0L : timeSlot2.getTimeStart();
        List<TimeSlot> timeSlots3 = interview.getTimeSlots();
        if (timeSlots3 != null && (timeSlot = (TimeSlot) z92.Q0(timeSlots3)) != null) {
            timeEnd = timeSlot.getTimeEnd();
        }
        long j = timeEnd;
        String externalInterviewId = interview.getExternalInterviewId();
        boolean z = !interview.getInterviewGTS();
        nl7 interviewFormatType = getInterviewFormatType(interview.getFormatType());
        String address = interview.getMetadata().getAddress();
        String phoneNumber = interview.getMetadata().getPhoneNumber();
        boolean availabilityBasedScheduling = interview.getAvailabilityBasedScheduling();
        String jobUrl = interview.getJobDetails().getJobUrl();
        String durationInMinutes = interview.getDurationInMinutes();
        JobTaxonomyOccupation taxonomyOccupation = interview.getJobDetails().getTaxonomyOccupation();
        if (taxonomyOccupation == null || (mostLikelySuids = taxonomyOccupation.getMostLikelySuids()) == null) {
            mostLikelySuids = zr4.a;
        }
        return new InterviewJobsDto(externalInterviewId, jobKey, title, company, location, timeStart, linkToCancel, linkToReschedule, linkToInterview, status, timeStart2, j, z, interviewFormatType, address, phoneNumber, Boolean.valueOf(availabilityBasedScheduling), jobUrl, durationInMinutes, false, false, mostLikelySuids, 1572864, null);
    }

    public static final InviteDto toInviteDto(p5a.g gVar) {
        gVar.getClass();
        String str = gVar.i;
        String strName = gVar.a.name();
        String strName2 = gVar.b.name();
        Boolean boolValueOf = Boolean.valueOf(gVar.c);
        Boolean boolValueOf2 = Boolean.valueOf(gVar.d);
        String string = gVar.e.toString();
        RecipientDto recipientDto = toRecipientDto(gVar.f);
        SenderDto senderDto = toSenderDto(gVar.g);
        ArrayList arrayList = gVar.h;
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(toCtaButtonDto((p5a.c) it.next()));
        }
        return new InviteDto(str, strName, strName2, boolValueOf, boolValueOf2, string, recipientDto, senderDto, arrayList2);
    }

    public static final InvitedJobDto toInvitedJobDto(p5a.h hVar) {
        JobDetailsDto jobDetailsDtoInit;
        hVar.getClass();
        p5a.i iVar = hVar.a;
        if (iVar == null || (jobDetailsDtoInit = toJobDetailsDto(iVar)) == null) {
            jobDetailsDtoInit = JobDetailsDto.INSTANCE.init();
        }
        InviteDto inviteDto = toInviteDto(hVar.b);
        p5a.b bVar = hVar.c;
        return new InvitedJobDto(jobDetailsDtoInit, inviteDto, bVar != null ? toConversationDto(bVar) : null);
    }

    public static final JobDetailsDto toJobDetailsDto(p5a.i iVar) {
        p5a.f fVar;
        iVar.getClass();
        String str = iVar.a;
        String str2 = iVar.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        p5a.a aVar = iVar.c;
        ArrayList arrayList = null;
        String str4 = aVar != null ? aVar.a : null;
        p5a.k kVar = iVar.d;
        String str5 = (kVar == null || (fVar = kVar.a) == null) ? null : fVar.a;
        p5a.e eVar = iVar.f;
        String str6 = eVar != null ? eVar.a : null;
        List<p5a.j> list = iVar.e;
        if (list != null) {
            List<p5a.j> list2 = list;
            arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(toJobTypeDto((p5a.j) it.next()));
            }
        }
        return new JobDetailsDto(str, str3, str4, str5, str6, arrayList);
    }

    public static final JobTypeDto toJobTypeDto(p5a.j jVar) {
        jVar.getClass();
        String str = jVar.a;
        if (str == null) {
            str = "";
        }
        String str2 = jVar.b;
        return new JobTypeDto(str, str2 != null ? str2 : "");
    }

    public static final RecipientDto toRecipientDto(p5a.m mVar) {
        mVar.getClass();
        return new RecipientDto(mVar.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.indeed.android.myjobs.data.model.dto.SavedJobsDto toSavedJobDTO(com.indeed.android.myjobs.data.model.AppStatusJob r46) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.myjobs.data.model.dto.DtoExtensionKt.toSavedJobDTO(com.indeed.android.myjobs.data.model.AppStatusJob):com.indeed.android.myjobs.data.model.dto.SavedJobsDto");
    }

    public static final SenderDto toSenderDto(p5a.n nVar) {
        nVar.getClass();
        return new SenderDto(nVar.b, nVar.a);
    }
}
