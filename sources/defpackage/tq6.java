package defpackage;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.w2;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class tq6 extends d4f {
    public static final b Companion = new b();
    public final String i;
    public final String j;
    public final String k;
    public final c l;
    public final da2 m;
    public final d n;

    @sy3
    public static final /* synthetic */ class a implements sw5<tq6> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("icon", aVar, 8);
            pluginGeneratedSerialDescriptor.k("accessibilityLabel", true);
            pluginGeneratedSerialDescriptor.k("accessibilityHide", true);
            pluginGeneratedSerialDescriptor.k("accessibilityRole", true);
            pluginGeneratedSerialDescriptor.k("impressionLogName", true);
            pluginGeneratedSerialDescriptor.k("clickLogName", true);
            pluginGeneratedSerialDescriptor.k("iconName", false);
            pluginGeneratedSerialDescriptor.k("color", true);
            pluginGeneratedSerialDescriptor.k("size", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            mve mveVar = mve.a;
            return new KSerializer[]{qp1.b(mveVar), qp1.b(ni1.a), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar), mveVar, qp1.b(mveVar), qp1.b(mveVar)};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Object obj = null;
            boolean z = true;
            int i = 0;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String strO = null;
            String str5 = null;
            String str6 = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                switch (iP) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str = (String) ul2VarB.h(serialDescriptor, 0, mve.a, str);
                        i |= 1;
                        break;
                    case 1:
                        bool = (Boolean) ul2VarB.h(serialDescriptor, 1, ni1.a, bool);
                        i |= 2;
                        break;
                    case 2:
                        str2 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str2);
                        i |= 4;
                        break;
                    case 3:
                        str3 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str3);
                        i |= 8;
                        break;
                    case 4:
                        str4 = (String) ul2VarB.h(serialDescriptor, 4, mve.a, str4);
                        i |= 16;
                        break;
                    case 5:
                        strO = ul2VarB.o(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        str5 = (String) ul2VarB.h(serialDescriptor, 6, mve.a, str5);
                        i |= 64;
                        break;
                    case 7:
                        str6 = (String) ul2VarB.h(serialDescriptor, 7, mve.a, str6);
                        i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    default:
                        b0.m(iP);
                        return obj;
                }
                obj = null;
            }
            ul2VarB.c(serialDescriptor);
            return new tq6(i, str, bool, str2, str3, str4, strO, str5, str6);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            tq6 tq6Var = (tq6) obj;
            tq6Var.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            d4f.a(tq6Var, vl2VarB, serialDescriptor);
            String str = tq6Var.i;
            String str2 = tq6Var.k;
            String str3 = tq6Var.j;
            vl2VarB.x(serialDescriptor, 5, str);
            if (vl2VarB.m(serialDescriptor) || str3 != null) {
                vl2VarB.k(serialDescriptor, 6, mve.a, str3);
            }
            if (vl2VarB.m(serialDescriptor) || str2 != null) {
                vl2VarB.k(serialDescriptor, 7, mve.a, str2);
            }
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    public static final class b {
        public final KSerializer<tq6> serializer() {
            return a.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final /* synthetic */ c[] a = {new c("AdditionalInfo", 0), new c("AddPerson", 1), new c("AddToFolder", 2), new c("Android", 3), new c("Apple", 4), new c("Archive", 5), new c("ArrowDown", 6), new c("ArrowLeft", 7), new c("ArrowRight", 8), new c("ArrowUp", 9), new c("ArtificialIntelligence", 10), new c("Attachment", 11), new c("Award", 12), new c("Ban", 13), new c("BankAccount", 14), new c("Benefits", 15), new c("BenefitsHealthInsurance", 16), new c("BenefitsInternetRupee", 17), new c("BenefitsLeaveRupee", 18), new c("BenefitsLifeInsurance", 19), new c("BenefitsMealRupee", 20), new c("BenefitsMobileRupee", 21), new c("BenefitsProvidentFundRupee", 22), new c("BenefitsPtoSickLeaveRupee", 23), new c("Bike", 24), new c("Bold", 25), new c("Bookmark", 26), new c("BookmarkOutline", 27), new c("BulletedList", 28), new c("Calendar", 29), new c("Camera", 30), new c("Campaign", 31), new c("CandidateMatch", 32), new c("Car", 33), new c("CaretDown", 34), new c("CaretDual", 35), new c("CaretUp", 36), new c("Certification", 37), new c("Chat", 38), new c("Check", 39), new c("CheckCircle", 40), new c("ChevronDown", 41), new c("ChevronLeft", 42), new c("ChevronRight", 43), new c("ChevronUp", 44), new c("Click", 45), new c("Clipboard", 46), new c("Clock", 47), new c("ClockDashed", 48), new c("ClockFilled", 49), new c("Close", 50), new c("CloseCircle", 51), new c("Code", 52), new c("Collapse", 53), new c("Commute", 54), new c("Company", 55), new c("Comparison", 56), new c("ConvertToEditable", 57), new c("Copy", 58), new c("CreditCard", 59), new c("CurrentLocation", 60), new c("DataBar", 61), new c("DataLineDown", 62), new c("DataLineFlat", 63), new c("DataLineUp", 64), new c("Date", 65), new c("DateApproved", 66), new c("DateCanceled", 67), new c("DateScheduled", 68), new c("Desktop", 69), new c("DesktopReport", 70), new c("Discover", 71), new c("DocReview", 72), new c("DoubleChevronLeft", 73), new c("DoubleChevronRight", 74), new c("Download", 75), new c("DownloadResume", 76), new c("Edit", 77), new c("EditSection", 78), new c("Education", 79), new c("Effects", 80), new c("Error", 81), new c("Expand", 82), new c("Facebook", 83), new c("Figma", 84), new c("FileDoc", 85), new c("FileImage", 86), new c("FileMisc", 87), new c("FilePreview", 88), new c("Filter", 89), new c("Folder", 90), new c("GetDirections", 91), new c("GitLab", 92), new c("Guarantee", 93), new c("Hamburger", 94), new c("Healthcare", 95), new c("Heart", 96), new c("HeartOutline", 97), new c("Hide", 98), new c("HiringBadge", 99), new c("Home", 100), new c("HomeInterview", 101), new c("Hourglass", 102), new c("Icon", 103), new c("IconProvider", 104), new c("IconProviderContext", 105), new c("UseIconProviderContext", 106), new c("Information", 107), new c("InsertTextTemplate", 108), new c("InsertVariable", 109), new c("Instagram", 110), new c("Interview", 111), new c("Italics", 112), new c("JobPreference", 113), new c("Jobs", 114), new c("JobTag", 115), new c("Language", 116), new c("Link", 117), new c("LinkedIn", 118), new c("LinkNone", 119), new c("Location", 120), new c("Lock", 121), new c("Mail", 122), new c("MailOpen", 123), new c("Maximize", 124), new c("Meal", 125), new c("Mic", 126), new c("MicMuted", 127), new c("Minimize", IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT), new c("Minus", 129), new c("MinusCircle", 130), new c("Mobile", 131), new c("MoneyStack", 132), new c("MoreHorizontal", 133), new c("MoreVertical", 134), new c("MoveSection", 135), new c("MoveToFolder", 136), new c("MyContributions", 137), new c("MyPage", 138), new c("NativeAndroidArrowBack", 139), new c("NativeAndroidArrowForward", 140), new c("NativeAndroidMore", 141), new c("NativeAndroidShare", 142), new c("NativeiOSChevronBack", 143), new c("NativeiOSChevronForward", 144), new c("NativeiOSMore", 145), new c("NativeiOSSafari", 146), new c("NativeiOSShare", 147), new c("NativeiOSTextFormat", 148), new c("NewWindow", 149), new c("NewWindowRtl", 150), new c("Notes", 151), new c("Notification", 152), new c("NotificationMuted", 153), new c("NumberedList", 154), new c("Occupation", 155), new c("OpenDoor", 156), new c("Patent", 157), new c("Pause", 158), new c("Pending", 159), new c("People", 160), new c("PersonSearch", 161), new c("Phone", 162), new c("PhoneIn", 163), new c("PhoneInMiss", 164), new c("PhoneOut", 165), new c("PhoneOutMiss", 166), new c("Placeholder", 167), new c("Plane", 168), new c("Play", 169), new c("Plus", 170), new c("PlusCircle", 171), new c("PostJob", 172), new c("Print", 173), new c("Profile", 174), new c("ProfileCircle", 175), new c("PromotionalOpportunity", 176), new c("Publication", 177), new c("Question", 178), new c("QuestionCircle", 179), new c("QuickApply", 180), new c("QuickInterview", 181), new c("RearrangeItems", 182), new c("RecentSearch", 183), new c("Record", 184), new c("Refresh", 185), new c("RemovePerson", 186), new c("Renew", 187), new c("ReplaceFile", 188), new c("Reply", 189), new c("ReplyAll", 190), new c("Report", 191), new c("Reset", 192), new c("Responsive", 193), new c("Restore", 194), new c("Resume", 195), new c("Salary", 196), new c("SalaryRupee", 197), new c("SalaryYen", 198), new c("Save", 199), new c("SaveSearch", UiRumDebugListener.DEFAULT_ALPHA), new c("Search", 201), new c("SearchSaved", DataOkHttpUploader.HTTP_ACCEPTED), new c("Settings", 203), new c("Share", 204), new c("ShareScreen", 205), new c("ShareScreenStop", 206), new c("Show", 207), new c("SignOut", 208), new c("Skills", 209), new c("Sms", 210), new c("SortAscending", 211), new c("SortDescending", 212), new c("Spam", 213), new c("Speakers", 214), new c("SpeakersMuted", 215), new c("Star", 216), new c("StarHalf", 217), new c("StarOutline", 218), new c("Stop", 219), new c("Stopwatch", 220), new c("Storybook", 221), new c("Summary", 222), new c("SuperPopular", 223), new c("SwitchLanguageHindi", 224), new c("ThumbsDown", 225), new c("ThumbsUp", 226), new c("Train", 227), new c("TrashCan", 228), new c("Truck", 229), new c("Twitter", 230), new c("Underline", 231), new c("Unlock", 232), new c("UnlockOutline", 233), new c("Upload", 234), new c("UrgentlyHiringIndia", 235), new c("Video", 236), new c("Waffle", 237), new c("Walking", 238), new c("Warning", 239), new c("Webpage", 240), new c("WhatsApp", 241), new c("Workflow", 242), new c("X", 243), new c("YouTube", 244)};

        /* JADX INFO: Fake field, exist only in values array */
        c EF5;

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final a a;
        public static final LinkedHashMap b;
        public static final /* synthetic */ d[] c;

        public static final class a {
        }

        static {
            d[] dVarArr = {new d("Sm", 0), new d("Md", 1), new d("Xs", 2)};
            c = dVarArr;
            wv4 wv4Var = new wv4(dVarArr);
            a = new a();
            int iV = kc9.V(t92.r0(wv4Var, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
            w2.b bVar = new w2.b();
            while (bVar.hasNext()) {
                Object next = bVar.next();
                linkedHashMap.put(((d) next).name(), next);
            }
            b = linkedHashMap;
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) c.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq6(int i, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7) {
        da2 da2Var;
        String string;
        String strValueOf;
        super(i, str, bool, str2, str3, str4);
        d dVar = null;
        if (32 != (i & 32)) {
            ewa.M(i, 32, a.a.get$$serialDesc());
            throw null;
        }
        this.i = str5;
        if ((i & 64) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
        this.l = c.valueOf(str5);
        String str8 = this.j;
        if (str8 != null) {
            Map<String, da2> map = g07.a;
            long j = eu6.m;
            Map<String, da2> map2 = g07.a;
            String lowerCase = str8.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            da2 da2Var2 = map2.get(lowerCase);
            da2Var = new da2(da2Var2 != null ? da2Var2.a : j);
        } else {
            da2Var = null;
        }
        this.m = da2Var;
        String str9 = this.k;
        if (str9 != null) {
            d.a.getClass();
            LinkedHashMap linkedHashMap = d.b;
            if (str9.length() > 0) {
                StringBuilder sb = new StringBuilder();
                char cCharAt = str9.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    strValueOf = ypd.Z(cCharAt, locale);
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb.append((Object) strValueOf);
                sb.append(str9.substring(1));
                string = sb.toString();
            } else {
                string = str9;
            }
            d dVar2 = (d) linkedHashMap.get(string);
            if (dVar2 == null) {
                l5.q("Unknown size: ".concat(str9));
                throw null;
            }
            dVar = dVar2;
        }
        this.n = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq6)) {
            return false;
        }
        tq6 tq6Var = (tq6) obj;
        return wl7.b(this.i, tq6Var.i) && wl7.b(this.j, tq6Var.j) && wl7.b(this.k, tq6Var.k);
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() * 31;
        String str = this.j;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return l6.i(u40.f("IconComponent(iconName=", this.i, ", color=", this.j, ", size="), this.k, ")");
    }
}
