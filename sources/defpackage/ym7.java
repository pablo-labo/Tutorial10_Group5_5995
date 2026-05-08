package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.dto.ConversationDto;
import com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto;
import com.indeed.android.myjobs.data.model.dto.InviteDto;
import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import com.indeed.android.myjobs.data.model.dto.JobDetailsDto;
import com.indeed.android.myjobs.data.model.dto.SenderDto;
import defpackage.b5a;
import defpackage.bn7;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.ude;
import defpackage.vs0;
import defpackage.ym7;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ym7 {

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabKt$DisplayErrorState$errorStateConfig$1$1$1", f = "InvitationTab.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ e8a $myJobsViewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e8a e8aVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$myJobsViewModel = e8aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$myJobsViewModel, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$myJobsViewModel.a0.k(new b5a.d(n7g.a(ie7.c0, "app-tracker-archived-emptytabmodalcta")));
            return j6g.a;
        }
    }

    public static final class b implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public b(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class c implements xu5<xo8, Integer, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ Function1 V;
        public final /* synthetic */ List a;
        public final /* synthetic */ bn7 b;
        public final /* synthetic */ Function1 c;
        public final /* synthetic */ Function1 d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        public c(List list, e8a e8aVar, bn7 bn7Var, Function1 function1, Function1 function12, String str, String str2, Function1 function13) {
            this.a = list;
            this.b = bn7Var;
            this.c = function1;
            this.d = function12;
            this.e = str;
            this.f = str2;
            this.V = function13;
        }

        @Override // defpackage.xu5
        public final j6g j(xo8 xo8Var, Integer num, androidx.compose.runtime.b bVar, Integer num2) {
            int i;
            String upperCase;
            String status;
            c8f c8fVar;
            String upperCase2;
            String name;
            String message;
            Date date;
            String strJ;
            xo8 xo8Var2 = xo8Var;
            int iIntValue = num.intValue();
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue2 = num2.intValue();
            int i2 = 4;
            if ((iIntValue2 & 6) == 0) {
                i = (bVar2.K(xo8Var2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= bVar2.d(iIntValue) ? 32 : 16;
            }
            if (bVar2.o(i & 1, (i & 147) != 146)) {
                InvitedJobDto invitedJobDto = (InvitedJobDto) this.a.get(iIntValue);
                bVar2.L(-41185905);
                boolean zB = wl7.b(this.e, invitedJobDto.getInvite().getId());
                boolean zB2 = wl7.b(this.f, invitedJobDto.getInvite().getId());
                String status2 = invitedJobDto.getInvite().getStatus();
                if (status2 != null) {
                    upperCase = status2.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                } else {
                    upperCase = null;
                }
                boolean zB3 = wl7.b(upperCase, "INITIATED");
                boolean zB4 = wl7.b(upperCase, "INTERESTED");
                if (wl7.b(upperCase, "INITIATED")) {
                    status = defpackage.l.e(bVar2, -273060889, R.string.contact_info_requested, bVar2);
                } else if (wl7.b(upperCase, "INTERESTED")) {
                    status = defpackage.l.e(bVar2, -273057660, R.string.contact_info_shared, bVar2);
                } else {
                    bVar2.L(125212482);
                    status = invitedJobDto.getInvite().getStatus();
                    if (status == null) {
                        status = defpackage.l.e(bVar2, -273054870, R.string.invitation_status_invited, bVar2);
                    } else {
                        bVar2.L(-273055552);
                        bVar2.F();
                    }
                    bVar2.F();
                }
                if (wl7.b(upperCase, "INITIATED")) {
                    c8fVar = c8f.a;
                } else {
                    wl7.b(upperCase, "INTERESTED");
                    c8fVar = c8f.b;
                }
                c8f c8fVar2 = c8fVar;
                String sentAt = invitedJobDto.getInvite().getSentAt();
                bVar2.L(-1420344589);
                String strI = ak2.I(R.string.invited_recently, bVar2);
                String strI2 = ak2.I(R.string.invited_today, bVar2);
                if (sentAt == null || sentAt.length() == 0) {
                    bVar2.F();
                } else {
                    Long lC = vve.C(sentAt);
                    if (lC == null) {
                        Iterator it = u63.a0("yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ss.SSS", "yyyy-MM-dd'T'HH:mm:ss'Z'", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd HH:mm:ss").iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                date = null;
                                break;
                            }
                            try {
                                date = new SimpleDateFormat((String) it.next(), Locale.getDefault()).parse(sentAt);
                                break;
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        date = new Date(lC.longValue());
                    }
                    if (date == null) {
                        bVar2.F();
                    } else {
                        long time = (new Date().getTime() - date.getTime()) / 86400000;
                        if (time == 0) {
                            bVar2.L(848491260);
                            bVar2.F();
                            strI = strI2;
                        } else {
                            if (1 > time || time >= 7) {
                                bVar2.L(533549503);
                                String str = new SimpleDateFormat("MMMM d", Locale.getDefault()).format(date);
                                str.getClass();
                                strJ = ak2.J(R.string.invited_on_date, new Object[]{str}, bVar2);
                                bVar2.F();
                            } else {
                                bVar2.L(848492592);
                                strJ = ak2.J(R.string.invited_days_ago, new Object[]{Integer.valueOf((int) time)}, bVar2);
                                bVar2.F();
                            }
                            strI = strJ;
                        }
                        bVar2.F();
                    }
                }
                String str2 = strI;
                String displayTitle = invitedJobDto.getJob().getDisplayTitle();
                String str3 = displayTitle == null ? "" : displayTitle;
                String employerName = invitedJobDto.getJob().getEmployerName();
                String str4 = employerName == null ? "" : employerName;
                String location = invitedJobDto.getJob().getLocation();
                String str5 = location == null ? "" : location;
                String jobTypesString = invitedJobDto.getJob().getJobTypesString();
                String compensation = invitedJobDto.getJob().getCompensation();
                String str6 = compensation == null ? "" : compensation;
                ConversationDto conversation = invitedJobDto.getConversation();
                String str7 = (conversation == null || (message = conversation.getMessage()) == null) ? "" : message;
                SenderDto sender = invitedJobDto.getInvite().getSender();
                String str8 = (sender == null || (name = sender.getName()) == null) ? "" : name;
                String id = invitedJobDto.getInvite().getId();
                String status3 = invitedJobDto.getInvite().getStatus();
                id.getClass();
                boolean zQ = i6a.q();
                if (status3 != null) {
                    upperCase2 = status3.toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                } else {
                    upperCase2 = null;
                }
                boolean zB5 = wl7.b(upperCase2, "INITIATED");
                bn7 bn7Var = this.b;
                boolean z = zQ && zB5 && !bn7Var.g0.containsKey(id);
                boolean zX = bVar2.x(invitedJobDto);
                Function1 function1 = this.V;
                boolean zK = zX | bVar2.K(function1);
                Object objV = bVar2.v();
                int i3 = 8;
                b.a.C0020a c0020a = b.a.a;
                if (zK || objV == c0020a) {
                    objV = new rr(i3, invitedJobDto, function1);
                    bVar2.p(objV);
                }
                gu5 gu5Var = (gu5) objV;
                Function1 function12 = this.c;
                boolean zK2 = bVar2.K(function12) | bVar2.x(invitedJobDto);
                Object objV2 = bVar2.v();
                if (zK2 || objV2 == c0020a) {
                    objV2 = new oa0(5, function12, invitedJobDto);
                    bVar2.p(objV2);
                }
                gu5 gu5Var2 = (gu5) objV2;
                Function1 function13 = this.d;
                boolean zK3 = bVar2.K(function13) | bVar2.x(invitedJobDto);
                Object objV3 = bVar2.v();
                if (zK3 || objV3 == c0020a) {
                    objV3 = new pa0(6, function13, invitedJobDto);
                    bVar2.p(objV3);
                }
                gu5 gu5Var3 = (gu5) objV3;
                boolean zX2 = bVar2.x(invitedJobDto) | bVar2.K(function1);
                Object objV4 = bVar2.v();
                if (zX2 || objV4 == c0020a) {
                    objV4 = new qe(i3, invitedJobDto, function1);
                    bVar2.p(objV4);
                }
                gu5 gu5Var4 = (gu5) objV4;
                boolean zX3 = bVar2.x(bn7Var) | bVar2.x(invitedJobDto);
                Object objV5 = bVar2.v();
                if (zX3 || objV5 == c0020a) {
                    objV5 = new ai(i2, bn7Var, invitedJobDto);
                    bVar2.p(objV5);
                }
                jr4.a(new kr4(status, c8fVar2, str2, str3, str4, str5, jobTypesString, str6, str8, str7, zB3, zB4, zB, zB2, gu5Var, gu5Var2, gu5Var3, gu5Var4, (gu5) objV5, z), androidx.compose.foundation.layout.g.f(e.a.b, 1.0f), bVar2, 48);
                bVar2.F();
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabKt$InvitationTab$1$1", f = "InvitationTab.kt", l = {}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ bn7 $invitationTabViewModel;
        final /* synthetic */ e8a $myJobsViewModel;
        final /* synthetic */ e13 $scope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(bn7 bn7Var, e8a e8aVar, e13 e13Var, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$invitationTabViewModel = bn7Var;
            this.$myJobsViewModel = e8aVar;
            this.$scope = e13Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new d(this.$invitationTabViewModel, this.$myJobsViewModel, this.$scope, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            if (this.$invitationTabViewModel.f0 && ((gme) this.$myJobsViewModel.V).getValue() == j7f.b) {
                this.$myJobsViewModel.i("Invitations", this.$scope);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabKt$InvitationTab$3$1$1$1$1$1$1", f = "InvitationTab.kt", l = {164}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $acceptedSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(hw9 hw9Var, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.$acceptedSheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new e(this.$acceptedSheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$acceptedSheetState;
                this.label = 1;
                Object objB = hw9Var.b(this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabKt$InvitationTab$3$1$1$1$2$1$1", f = "InvitationTab.kt", l = {172}, m = "invokeSuspend")
    public static final class f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $acceptedSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(hw9 hw9Var, lu2<? super f> lu2Var) {
            super(2, lu2Var);
            this.$acceptedSheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new f(this.$acceptedSheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$acceptedSheetState;
                this.label = 1;
                Object objB = hw9Var.b(this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabKt$InvitationTab$3$1$1$2$1$1$1", f = "InvitationTab.kt", l = {199}, m = "invokeSuspend")
    public static final class g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $declineReasonSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(hw9 hw9Var, lu2<? super g> lu2Var) {
            super(2, lu2Var);
            this.$declineReasonSheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new g(this.$declineReasonSheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$declineReasonSheetState;
                this.label = 1;
                Object objD = hw9Var.d(this);
                g13 g13Var = g13.a;
                if (objD == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabKt$InvitationTab$3$1$1$2$2$1$1$1", f = "InvitationTab.kt", l = {214}, m = "invokeSuspend")
    public static final class h extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $acceptedSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(hw9 hw9Var, lu2<? super h> lu2Var) {
            super(2, lu2Var);
            this.$acceptedSheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new h(this.$acceptedSheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((h) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$acceptedSheetState;
                this.label = 1;
                Object objD = hw9Var.d(this);
                g13 g13Var = g13.a;
                if (objD == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabKt$InvitationTab$3$1$1$3$1$1$1", f = "InvitationTab.kt", l = {246}, m = "invokeSuspend")
    public static final class i extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $declineReasonSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(hw9 hw9Var, lu2<? super i> lu2Var) {
            super(2, lu2Var);
            this.$declineReasonSheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new i(this.$declineReasonSheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((i) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$declineReasonSheetState;
                this.label = 1;
                Object objB = hw9Var.b(this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabKt$InvitationTab$3$1$1$3$2$1$1$1$1", f = "InvitationTab.kt", l = {264}, m = "invokeSuspend")
    public static final class j extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $declineReasonSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(hw9 hw9Var, lu2<? super j> lu2Var) {
            super(2, lu2Var);
            this.$declineReasonSheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new j(this.$declineReasonSheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((j) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$declineReasonSheetState;
                this.label = 1;
                Object objB = hw9Var.b(this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabKt$InvitationTab$3$1$1$3$3$1$1", f = "InvitationTab.kt", l = {289}, m = "invokeSuspend")
    public static final class k extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $declineReasonSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(hw9 hw9Var, lu2<? super k> lu2Var) {
            super(2, lu2Var);
            this.$declineReasonSheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new k(this.$declineReasonSheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((k) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$declineReasonSheetState;
                this.label = 1;
                Object objB = hw9Var.b(this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public static final class l implements l74 {
        public final /* synthetic */ bn7 a;
        public final /* synthetic */ zv8 b;
        public final /* synthetic */ wm7 c;

        public l(bn7 bn7Var, zv8 zv8Var, wm7 wm7Var) {
            this.a = bn7Var;
            this.b = zv8Var;
            this.c = wm7Var;
        }

        @Override // defpackage.l74
        public final void dispose() {
            this.a.n(bn7.a.c.a);
            this.b.getLifecycle().c(this.c);
        }
    }

    public static final /* synthetic */ class m extends fa implements gu5<j6g> {
        final /* synthetic */ bn7 $invitationTabViewModel;
        final /* synthetic */ g4a<Boolean> $refreshing$delegate;
        final /* synthetic */ e13 $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(e13 e13Var, bn7 bn7Var, g4a<Boolean> g4aVar) {
            super("InvitationTab$refresh(Lkotlinx/coroutines/CoroutineScope;Lcom/indeed/android/myjobs/presentation/tabs/InvitationTabViewModel;Landroidx/compose/runtime/MutableState;)Lkotlinx/coroutines/Job;");
            this.$scope = e13Var;
            this.$invitationTabViewModel = bn7Var;
            this.$refreshing$delegate = g4aVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            u63.Y(this.$scope, null, null, new zm7(this.$invitationTabViewModel, this.$refreshing$delegate, null), 3);
            return j6g.a;
        }
    }

    public static final void a(int i2, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(-193324021);
        if (cVarH.o(i2 & 1, i2 != 0)) {
            os4.a(new ks4(z2b.a(R.drawable.empty_state_invitation_icon, 0, cVarH), ak2.I(R.string.empty_screen_icon, cVarH), ak2.I(R.string.invitations_empty_title, cVarH), ak2.I(R.string.invitations_empty_subtitle, cVarH), (String) null, (gu5) null, (String) null, (gu5) null, 384), false, false, cVarH, 0, 6);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new hm0(i2, 6);
        }
    }

    public static final void b(e8a e8aVar, bn7 bn7Var, androidx.compose.runtime.b bVar, int i2) {
        androidx.compose.runtime.c cVarH = bVar.h(-775600034);
        int i3 = (cVarH.x(e8aVar) ? 4 : 2) | i2 | (cVarH.x(bn7Var) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV;
            x2b x2bVarA = z2b.a(R.drawable.error_image, 0, cVarH);
            String strI = ak2.I(R.string.error_screen_icon, cVarH);
            String strI2 = ak2.I(R.string.error_screen_title, cVarH);
            String strI3 = ak2.I(R.string.error_screen_sub_title, cVarH);
            String strI4 = ak2.I(R.string.error_button_refresh, cVarH);
            String strI5 = ak2.I(R.string.error_footer_link_text, cVarH);
            String strI6 = ak2.I(R.string.error_footer_normal_text, cVarH);
            boolean zX = cVarH.x(e13Var) | cVarH.x(e8aVar);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new yi(8, e13Var, e8aVar);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            boolean zX2 = cVarH.x(bn7Var);
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a) {
                objV3 = new oa(bn7Var, 14);
                cVarH.p(objV3);
            }
            cx4.a(new gx4(x2bVarA, strI, strI2, strI3, strI5, strI6, gu5Var, strI4, (gu5) objV3), cVarH, 0);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new jh(e8aVar, i2, 5, bn7Var);
        }
    }

    public static final void c(final List<InvitedJobDto> list, ss8 ss8Var, final e8a e8aVar, final bn7 bn7Var, final Function1<? super InvitedJobDto, j6g> function1, final Function1<? super InvitedJobDto, j6g> function12, final String str, final String str2, final Function1<? super String, j6g> function13, androidx.compose.runtime.b bVar, int i2) {
        androidx.compose.runtime.c cVarH = bVar.h(-174191061);
        int i3 = (cVarH.x(function13) ? 67108864 : 33554432) | i2 | (cVarH.x(list) ? 4 : 2) | (cVarH.K(ss8Var) ? 32 : 16) | (cVarH.x(e8aVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(bn7Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function1) ? 16384 : 8192) | (cVarH.x(function12) ? 131072 : 65536) | (cVarH.K(str) ? 1048576 : 524288) | (cVarH.K(str2) ? 8388608 : 4194304);
        int i4 = 0;
        if (cVarH.o(i3 & 1, (38347923 & i3) != 38347922)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            o97.g gVar = o97Var.i;
            vs0.i iVar = new vs0.i(8.0f, true, new us0(i4));
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.f.h(e.a.b, 0.0f, 8.0f, 1);
            boolean zX = cVarH.x(list) | cVarH.x(o97Var) | cVarH.x(e8aVar) | cVarH.x(bn7Var) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                Function1 function14 = new Function1() { // from class: pm7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ls8 ls8Var = (ls8) obj;
                        ls8Var.getClass();
                        List list2 = list;
                        if (!list2.isEmpty()) {
                            ls8.e(ls8Var, null, new ah2(858139483, new dl4(o97Var, 2), true), 3);
                        }
                        ls8Var.c(list2.size(), null, new ym7.b(list2), new ah2(802480018, new ym7.c(list2, e8aVar, bn7Var, function1, function12, str, str2, function13), true));
                        return j6g.a;
                    }
                };
                cVarH.p(function14);
                objV = function14;
            }
            hn8.b(eVarH, ss8Var, null, false, iVar, null, null, false, null, (Function1) objV, cVarH, i3 & 112, 492);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new jr2(list, ss8Var, e8aVar, bn7Var, function1, function12, str, str2, function13, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    public static final void d(final e8a e8aVar, ss8 ss8Var, androidx.compose.runtime.b bVar, int i2) {
        ?? r10;
        androidx.compose.runtime.c cVar;
        e.a aVar;
        g4a g4aVar;
        boolean z;
        Object obj;
        boolean z2;
        androidx.compose.runtime.c cVar2;
        androidx.compose.runtime.c cVar3;
        Bundle bundleA;
        Bundle bundleA2;
        e8aVar.getClass();
        ss8Var.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(1964006752);
        int i3 = i2 | (cVarH.x(e8aVar) ? 4 : 2) | (cVarH.K(ss8Var) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            cVarH.u(-1072256281);
            jrg jrgVarA = z09.a(cVarH);
            if (jrgVarA == null) {
                r6.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            p63 p63VarA = ojd.a(jrgVarA, cVarH);
            vh8 vh8Var = web.d;
            if (vh8Var == null) {
                r6.g("KoinApplication has not been started");
                return;
            }
            qpd qpdVar = (qpd) vh8Var.a.b;
            androidx.navigation.d dVar = jrgVarA instanceof androidx.navigation.d ? (androidx.navigation.d) jrgVarA : null;
            p63 p63VarQ = (dVar == null || (bundleA2 = dVar.a()) == null) ? null : pnb.Q(bundleA2, jrgVarA);
            iwc iwcVar = fwc.a;
            yd8 yd8VarB = iwcVar.b(bn7.class);
            irg viewModelStore = jrgVarA.getViewModelStore();
            viewModelStore.getClass();
            if (p63VarQ != null) {
                p63VarA = p63VarQ;
            }
            brg brgVarA = p66.a(yd8VarB, viewModelStore, p63VarA, null, qpdVar, null);
            cVarH.U(false);
            final bn7 bn7Var = (bn7) brgVarA;
            cVarH.u(-1072256281);
            jrg jrgVarA2 = z09.a(cVarH);
            if (jrgVarA2 == null) {
                r6.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            p63 p63VarA2 = ojd.a(jrgVarA2, cVarH);
            vh8 vh8Var2 = web.d;
            if (vh8Var2 == null) {
                r6.g("KoinApplication has not been started");
                return;
            }
            qpd qpdVar2 = (qpd) vh8Var2.a.b;
            androidx.navigation.d dVar2 = jrgVarA2 instanceof androidx.navigation.d ? (androidx.navigation.d) jrgVarA2 : null;
            p63 p63VarQ2 = (dVar2 == null || (bundleA = dVar2.a()) == null) ? null : pnb.Q(bundleA, jrgVarA2);
            yd8 yd8VarB2 = iwcVar.b(ude.class);
            irg viewModelStore2 = jrgVarA2.getViewModelStore();
            viewModelStore2.getClass();
            brg brgVarA2 = p66.a(yd8VarB2, viewModelStore2, p63VarQ2 == null ? p63VarA2 : p63VarQ2, null, qpdVar2, null);
            cVarH.U(false);
            final ude udeVar = (ude) brgVarA2;
            an7 an7Var = (an7) r.a(bn7Var.c, cVarH).getValue();
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            g4a g4aVar2 = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV2;
            boolean zBooleanValue = ((Boolean) g4aVar2.getValue()).booleanValue();
            boolean zX = cVarH.x(e13Var) | cVarH.x(bn7Var);
            Object objV3 = cVarH.v();
            if (zX || objV3 == c0020a) {
                objV3 = new m(e13Var, bn7Var, g4aVar2);
                cVarH.p(objV3);
            }
            g7c g7cVarD = jh2.D(zBooleanValue, (gu5) objV3, cVarH);
            Boolean boolValueOf = Boolean.valueOf(bn7Var.f0);
            Object value = ((gme) e8aVar.V).getValue();
            boolean zX2 = cVarH.x(bn7Var) | cVarH.x(e8aVar) | cVarH.x(e13Var);
            Object objV4 = cVarH.v();
            if (zX2 || objV4 == c0020a) {
                objV4 = new d(bn7Var, e8aVar, e13Var, null);
                cVarH.p(objV4);
            }
            to4.f(boolValueOf, value, (Function2) objV4, cVarH);
            zv8 zv8Var = (zv8) cVarH.M(r09.a);
            boolean zX3 = cVarH.x(bn7Var) | cVarH.x(zv8Var);
            Object objV5 = cVarH.v();
            if (zX3 || objV5 == c0020a) {
                objV5 = new wj4(3, zv8Var, bn7Var);
                cVarH.p(objV5);
            }
            to4.b(zv8Var, (Function1) objV5, cVarH);
            androidx.compose.ui.e eVarL = pyd.L(g7cVarD);
            af1 af1Var = c20.a.a;
            ag9 ag9VarD = hl1.d(af1Var, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(cVarH, eVarL);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar3 = gl2.a.g;
            ygg.y(cVarH, ag9VarD, dVar3);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            String strI = ak2.I(R.string.invitation_tab_test_tag, cVarH);
            e.a aVar3 = e.a.b;
            androidx.compose.ui.e eVarA = androidx.compose.ui.platform.f.a(aVar3, strI);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            androidx.compose.ui.e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarA);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, dVar3);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            if (an7Var.b) {
                cVarH.L(-1757302748);
                kee.b(0, cVarH);
                cVarH.U(false);
            } else if (an7Var.c != null) {
                cVarH.L(-1757196542);
                b(e8aVar, bn7Var, cVarH, i3 & 14);
                bn7Var.n(bn7.a.C0096a.a);
                cVarH.U(false);
            } else {
                EmployerInvitationDto employerInvitationDto = an7Var.a;
                List<InvitedJobDto> invitedJobs = employerInvitationDto != null ? employerInvitationDto.getInvitedJobs() : null;
                if (invitedJobs == null || invitedJobs.isEmpty()) {
                    androidx.compose.runtime.c cVar4 = cVarH;
                    aVar = aVar3;
                    g4aVar = g4aVar2;
                    z = true;
                    cVar4.L(-1756912861);
                    a(0, cVar4);
                    cVar4.U(false);
                    cVar3 = cVar4;
                } else {
                    cVarH.L(-1756473374);
                    Object objV6 = cVarH.v();
                    if (objV6 == c0020a) {
                        objV6 = v40.b(cVarH.l(), cVarH);
                    }
                    final e13 e13Var2 = (e13) objV6;
                    iw9 iw9Var = iw9.a;
                    final hw9 hw9VarC = androidx.compose.material.a.c(iw9Var, null, cVarH, 3078, 6);
                    final hw9 hw9VarC2 = androidx.compose.material.a.c(iw9Var, null, cVarH, 3078, 6);
                    Object objV7 = cVarH.v();
                    if (objV7 == c0020a) {
                        objV7 = r.f("");
                        cVarH.p(objV7);
                    }
                    final g4a g4aVar3 = (g4a) objV7;
                    Object objV8 = cVarH.v();
                    if (objV8 == c0020a) {
                        objV8 = r.f("");
                        cVarH.p(objV8);
                    }
                    final g4a g4aVar4 = (g4a) objV8;
                    Object objV9 = cVarH.v();
                    if (objV9 == c0020a) {
                        objV9 = r.f("");
                        cVarH.p(objV9);
                    }
                    final g4a g4aVar5 = (g4a) objV9;
                    Object objV10 = cVarH.v();
                    if (objV10 == c0020a) {
                        obj = null;
                        objV10 = r.f(null);
                        cVarH.p(objV10);
                    } else {
                        obj = null;
                    }
                    final g4a g4aVar6 = (g4a) objV10;
                    Object objV11 = cVarH.v();
                    if (objV11 == c0020a) {
                        objV11 = r.f(obj);
                        cVarH.p(objV11);
                    }
                    final g4a g4aVar7 = (g4a) objV11;
                    Object objV12 = cVarH.v();
                    if (objV12 == c0020a) {
                        objV12 = r.f(obj);
                        cVarH.p(objV12);
                    }
                    final g4a g4aVar8 = (g4a) objV12;
                    Object objV13 = cVarH.v();
                    if (objV13 == c0020a) {
                        objV13 = r.f(Boolean.FALSE);
                        cVarH.p(objV13);
                    }
                    final g4a g4aVar9 = (g4a) objV13;
                    final String strI2 = ak2.I(R.string.invitation_declined_success, cVarH);
                    final String strI3 = ak2.I(R.string.invitation_error_message, cVarH);
                    o97 o97Var = (o97) cVarH.M(p97.a);
                    fgd fgdVarB = ggd.b(bkf.c(o97Var.e.e), bkf.c(o97Var.e.e), 0.0f, 0.0f);
                    ag9 ag9VarD2 = hl1.d(af1Var, false);
                    int iHashCode3 = Long.hashCode(cVarH.T);
                    t8b t8bVarP3 = cVarH.P();
                    androidx.compose.ui.e eVarC3 = androidx.compose.ui.c.c(cVarH, aVar3);
                    cVarH.B();
                    if (cVarH.S) {
                        cVarH.y(aVar2);
                    } else {
                        cVarH.n();
                    }
                    ygg.y(cVarH, ag9VarD2, dVar3);
                    ygg.y(cVarH, t8bVarP3, fVar);
                    if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                        ja.h(iHashCode3, cVarH, iHashCode3, c0251a);
                    }
                    ygg.y(cVarH, eVarC3, eVar);
                    aVar = aVar3;
                    g4aVar = g4aVar2;
                    androidx.compose.material.a.a(bh2.c(1655726223, new wu5() { // from class: qm7
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.wu5
                        public final Object q(Object obj2, Object obj3, Object obj4) {
                            hw9 hw9Var;
                            b bVar2 = (b) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            ((pb2) obj2).getClass();
                            if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                                String str = (String) g4aVar3.getValue();
                                x2b x2bVarA = z2b.a(R.drawable.sucessagreement, 0, bVar2);
                                final e13 e13Var3 = e13Var2;
                                boolean zX4 = bVar2.x(e13Var3);
                                hw9 hw9Var2 = hw9VarC;
                                boolean zX5 = zX4 | bVar2.x(hw9Var2);
                                Object objV14 = bVar2.v();
                                final g4a g4aVar10 = g4aVar6;
                                final g4a g4aVar11 = g4aVar5;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zX5 || objV14 == c0020a2) {
                                    hw9Var = hw9Var2;
                                    ax axVar = new ax(e13Var3, g4aVar10, g4aVar11, hw9Var, 1);
                                    bVar2.p(axVar);
                                    objV14 = axVar;
                                } else {
                                    hw9Var = hw9Var2;
                                }
                                gu5 gu5Var = (gu5) objV14;
                                boolean zX6 = bVar2.x(e13Var3) | bVar2.x(hw9Var);
                                final hw9 hw9Var3 = hw9Var;
                                final e8a e8aVar2 = e8aVar;
                                boolean zX7 = zX6 | bVar2.x(e8aVar2);
                                Object objV15 = bVar2.v();
                                if (zX7 || objV15 == c0020a2) {
                                    final g4a g4aVar12 = g4aVar4;
                                    gu5 gu5Var2 = new gu5() { // from class: sm7
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // defpackage.gu5
                                        public final Object invoke() {
                                            Function1<lx5, j6g> function1 = c05.a;
                                            c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "acceptInvitationModalMessageCTA", new wj4(2, (String) g4aVar10.getValue(), (String) g4aVar11.getValue()), 4));
                                            u63.Y(e13Var3, null, null, new ym7.f(hw9Var3, null), 3);
                                            g4a g4aVar13 = g4aVar12;
                                            if (((String) g4aVar13.getValue()).length() > 0) {
                                                e8aVar2.a0.k(new b5a.e((String) g4aVar13.getValue()));
                                            }
                                            return j6g.a;
                                        }
                                    };
                                    bVar2.p(gu5Var2);
                                    objV15 = gu5Var2;
                                }
                                om7.a(str, x2bVarA, gu5Var, (gu5) objV15, null, bVar2, 0);
                            } else {
                                bVar2.D();
                            }
                            return j6g.a;
                        }
                    }, cVarH), null, hw9VarC, false, fgdVarB, 0.0f, 0L, 0L, 0L, bh2.c(-376085194, new gl4(an7Var, ss8Var, e8aVar, bn7Var, e13Var2, hw9VarC2, hw9VarC, udeVar, strI3, g4aVar8, g4aVar6, g4aVar3, g4aVar4, g4aVar5, g4aVar7), cVarH), cVarH, 805306886, 490);
                    if (hw9VarC2.c() || ((iw9) hw9VarC2.c.h.getValue()) != iw9Var) {
                        cVarH.L(1982450687);
                        long j2 = o97Var.c.b.a;
                        androidx.compose.runtime.c cVar5 = cVarH;
                        z2 = false;
                        androidx.compose.material.a.a(bh2.c(-2140842412, new wu5() { // from class: rm7
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.wu5
                            public final Object q(Object obj2, Object obj3, Object obj4) {
                                JobDetailsDto job;
                                InviteDto invite;
                                b bVar2 = (b) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((pb2) obj2).getClass();
                                if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    final e13 e13Var3 = e13Var2;
                                    boolean zX4 = bVar2.x(e13Var3);
                                    final hw9 hw9Var = hw9VarC2;
                                    boolean zX5 = zX4 | bVar2.x(hw9Var);
                                    Object objV14 = bVar2.v();
                                    b.a.C0020a c0020a2 = b.a.a;
                                    if (zX5 || objV14 == c0020a2) {
                                        objV14 = new jp0(6, e13Var3, hw9Var);
                                        bVar2.p(objV14);
                                    }
                                    gu5 gu5Var = (gu5) objV14;
                                    final bn7 bn7Var2 = bn7Var;
                                    boolean zX6 = bVar2.x(bn7Var2) | bVar2.x(e13Var3) | bVar2.x(hw9Var);
                                    final ude udeVar2 = udeVar;
                                    boolean zX7 = zX6 | bVar2.x(udeVar2);
                                    final String str = strI2;
                                    boolean zK = zX7 | bVar2.K(str);
                                    final String str2 = strI3;
                                    boolean zK2 = zK | bVar2.K(str2);
                                    Object objV15 = bVar2.v();
                                    final g4a g4aVar10 = g4aVar8;
                                    final g4a g4aVar11 = g4aVar9;
                                    if (zK2 || objV15 == c0020a2) {
                                        final g4a g4aVar12 = g4aVar7;
                                        objV15 = new Function2() { // from class: um7
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj5, Object obj6) {
                                                String str3 = (String) obj5;
                                                String str4 = (String) obj6;
                                                str3.getClass();
                                                str4.getClass();
                                                InvitedJobDto invitedJobDto = (InvitedJobDto) g4aVar10.getValue();
                                                if (invitedJobDto != null) {
                                                    Boolean bool = Boolean.TRUE;
                                                    final g4a g4aVar13 = g4aVar11;
                                                    g4aVar13.setValue(bool);
                                                    String id = invitedJobDto.getInvite().getId();
                                                    final g4a g4aVar14 = g4aVar12;
                                                    g4aVar14.setValue(id);
                                                    final e13 e13Var4 = e13Var3;
                                                    final ude udeVar3 = udeVar2;
                                                    final String str5 = str;
                                                    final String str6 = str2;
                                                    final hw9 hw9Var2 = hw9Var;
                                                    Function1 function1 = new Function1() { // from class: xm7
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj7) {
                                                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                                                            g4aVar13.setValue(Boolean.FALSE);
                                                            g4aVar14.setValue(null);
                                                            u63.Y(e13Var4, null, null, new ym7.j(hw9Var2, null), 3);
                                                            ude udeVar4 = udeVar3;
                                                            if (zBooleanValue2) {
                                                                udeVar4.m(new ude.c.z(str5));
                                                            } else {
                                                                udeVar4.m(new ude.c.x(str6));
                                                            }
                                                            return j6g.a;
                                                        }
                                                    };
                                                    bn7 bn7Var3 = bn7Var2;
                                                    u63.Y(ee3.p(bn7Var3), null, null, new dn7(invitedJobDto, bn7Var3, str3, str4, function1, null), 3);
                                                }
                                                return j6g.a;
                                            }
                                        };
                                        bVar2.p(objV15);
                                    }
                                    Function2 function2 = (Function2) objV15;
                                    boolean zX8 = bVar2.x(e13Var3) | bVar2.x(hw9Var);
                                    Object objV16 = bVar2.v();
                                    if (zX8 || objV16 == c0020a2) {
                                        objV16 = new vm7(e13Var3, hw9Var);
                                        bVar2.p(objV16);
                                    }
                                    gu5 gu5Var2 = (gu5) objV16;
                                    boolean zBooleanValue2 = ((Boolean) g4aVar11.getValue()).booleanValue();
                                    InvitedJobDto invitedJobDto = (InvitedJobDto) g4aVar10.getValue();
                                    String key = null;
                                    String id = (invitedJobDto == null || (invite = invitedJobDto.getInvite()) == null) ? null : invite.getId();
                                    InvitedJobDto invitedJobDto2 = (InvitedJobDto) g4aVar10.getValue();
                                    if (invitedJobDto2 != null && (job = invitedJobDto2.getJob()) != null) {
                                        key = job.getKey();
                                    }
                                    lj3.a(gu5Var, new mj3(function2, gu5Var2, zBooleanValue2, id, key), bVar2, 0);
                                } else {
                                    bVar2.D();
                                }
                                return j6g.a;
                            }
                        }, cVarH), null, hw9VarC2, false, fgdVarB, 0.0f, j2, 0L, 0L, h4.e, cVar5, 805306886, 426);
                        cVar5.U(false);
                        cVar2 = cVar5;
                    } else {
                        cVarH.L(1969258885);
                        cVarH.U(false);
                        z2 = false;
                        cVar2 = cVarH;
                    }
                    z = true;
                    cVar2.U(true);
                    cVar2.U(z2);
                    cVar3 = cVar2;
                }
                cVar3.U(z);
                c7c.b(((Boolean) g4aVar.getValue()).booleanValue(), g7cVarD, androidx.compose.foundation.layout.b.a.h(aVar, c20.a.b), 0L, 0L, cVar3, 64);
                cVar3.U(z);
                r10 = z;
                cVar = cVar3;
            }
            cVar3 = cVarH;
            aVar = aVar3;
            g4aVar = g4aVar2;
            z = true;
            cVar3.U(z);
            c7c.b(((Boolean) g4aVar.getValue()).booleanValue(), g7cVarD, androidx.compose.foundation.layout.b.a.h(aVar, c20.a.b), 0L, 0L, cVar3, 64);
            cVar3.U(z);
            r10 = z;
            cVar = cVar3;
        } else {
            androidx.compose.runtime.c cVar6 = cVarH;
            r10 = 1;
            cVar6.D();
            cVar = cVar6;
        }
        androidx.compose.runtime.i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new fu(e8aVar, i2, r10, ss8Var);
        }
    }
}
