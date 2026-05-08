package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ew2 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;
    public static final List<vd2> h;
    public static final List<vd2> i;
    public static final List<vd2> j;

    static {
        mb3 mb3Var = zb6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("required", ud2VarA, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = qg3.a;
        mb3Var2.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, new pd2(NdkCrashLog.TIMESTAMP_KEY_NAME, mb3Var2, zr4Var, zr4Var, zr4Var));
        a = listA0;
        sna snaVar = ly2.a;
        snaVar.getClass();
        List<vd2> listZ = u63.Z(new pd2("requireResponse", snaVar, u63.Z(new nd2()), zr4Var, listA0));
        b = listZ;
        List<vd2> listA02 = u63.a0(new pd2("lastVisited", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("readCursor", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("unreadCount", rd2.a(lc6.a), zr4Var, zr4Var, zr4Var));
        c = listA02;
        mb3 mb3Var3 = pc6.a;
        List<vd2> listM = k20.m("labels", new ud2(new sd2(rd2.a(mb3Var3))), zr4Var, zr4Var, zr4Var);
        d = listM;
        gy2.a.getClass();
        pd2 pd2Var2 = new pd2("role", rd2.a(gy2.b), zr4Var, zr4Var, zr4Var);
        mb3 mb3Var4 = hc6.a;
        mb3Var4.getClass();
        List<vd2> listA03 = u63.a0(pd2Var2, new pd2("accountKey", mb3Var4, zr4Var, zr4Var, zr4Var), new pd2("participantName", mb3Var3, zr4Var, zr4Var, zr4Var), new pd2("removed", mb3Var, zr4Var, zr4Var, zr4Var));
        e = listA03;
        pd2 pd2Var3 = new pd2("__typename", new ud2(mb3Var3), zr4Var, zr4Var, zr4Var);
        List listZ2 = u63.Z("Job");
        List<vd2> list = ly7.l;
        List<vd2> listA04 = u63.a0(pd2Var3, s40.b(list, "Job", listZ2, list));
        f = listA04;
        pd2 pd2Var4 = new pd2("__typename", new ud2(mb3Var3), zr4Var, zr4Var, zr4Var);
        List listZ3 = u63.Z("ConversationEvent");
        List<vd2> list2 = nk8.c;
        List<vd2> listA05 = u63.a0(pd2Var4, s40.b(list2, "ConversationEvent", listZ3, list2), new pd2("id", new ud2(mb3Var4), zr4Var, zr4Var, zr4Var));
        g = listA05;
        pd2 pd2Var5 = new pd2("primary", mb3Var, zr4Var, zr4Var, zr4Var);
        r29.a.getClass();
        bw4 bw4Var = r29.b;
        bw4Var.getClass();
        List<vd2> listA06 = u63.a0(pd2Var5, new pd2("reason", bw4Var, zr4Var, zr4Var, zr4Var), new pd2(NdkCrashLog.TIMESTAMP_KEY_NAME, mb3Var2, zr4Var, zr4Var, zr4Var));
        h = listA06;
        qy2.a.getClass();
        List<vd2> listA07 = u63.a0(new pd2("key", rd2.a(qy2.b), zr4Var, zr4Var, zr4Var), new pd2("value", new ud2(mb3Var3), zr4Var, zr4Var, zr4Var));
        i = listA07;
        pd2 pd2Var6 = new pd2("id", new ud2(mb3Var4), zr4Var, zr4Var, zr4Var);
        av2.a.getClass();
        pd2 pd2Var7 = new pd2(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, rd2.a(av2.b), zr4Var, zr4Var, zr4Var);
        sna snaVar2 = uy2.a;
        snaVar2.getClass();
        pd2 pd2Var8 = new pd2("userContext", snaVar2, zr4Var, zr4Var, listZ);
        sna snaVar3 = ky2.a;
        snaVar3.getClass();
        pd2 pd2Var9 = new pd2("userReadsInfo", snaVar3, zr4Var, zr4Var, listA02);
        sna snaVar4 = ex2.a;
        snaVar4.getClass();
        pd2 pd2Var10 = new pd2("userLabelInfo", snaVar4, zr4Var, zr4Var, listM);
        pd2 pd2Var11 = new pd2("participants", new ud2(new sd2(rd2.a(fy2.a))), zr4Var, zr4Var, listA03);
        sna snaVar5 = fx7.a;
        snaVar5.getClass();
        pd2 pd2Var12 = new pd2("job", snaVar5, zr4Var, zr4Var, listA04);
        sna snaVar6 = fw2.b;
        snaVar6.getClass();
        j = u63.a0(pd2Var6, pd2Var7, pd2Var8, pd2Var9, pd2Var10, pd2Var11, pd2Var12, new pd2("lastEvent", snaVar6, zr4Var, zr4Var, listA05), new pd2("locks", new ud2(new sd2(rd2.a(i29.a))), zr4Var, zr4Var, listA06), new pd2("scope", new ud2(new sd2(rd2.a(my2.a))), zr4Var, zr4Var, listA07), new pd2("__typename", new ud2(mb3Var3), zr4Var, zr4Var, zr4Var));
    }
}
