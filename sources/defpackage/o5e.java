package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class o5e {
    public static final /* synthetic */ qf8<Object>[] a;

    static {
        w3a w3aVar = new w3a(o5e.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        iwc iwcVar = fwc.a;
        a = new qf8[]{iwcVar.e(w3aVar), r40.b(o5e.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1, iwcVar), r40.b(o5e.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, iwcVar), r40.b(o5e.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, iwcVar), r40.b(o5e.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, iwcVar), r40.b(o5e.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, iwcVar), r40.b(o5e.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, iwcVar), r40.b(o5e.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, iwcVar), r40.b(o5e.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1, iwcVar), r40.b(o5e.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1, iwcVar), r40.b(o5e.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1, iwcVar), r40.b(o5e.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, iwcVar), r40.b(o5e.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, iwcVar), r40.b(o5e.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, iwcVar), r40.b(o5e.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, iwcVar), r40.b(o5e.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, iwcVar), r40.b(o5e.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, iwcVar), r40.b(o5e.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, iwcVar), r40.b(o5e.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, iwcVar), r40.b(o5e.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1, iwcVar), r40.b(o5e.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, iwcVar), r40.b(o5e.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, iwcVar), r40.b(o5e.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1, iwcVar), r40.b(o5e.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1, iwcVar), r40.b(o5e.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1, iwcVar), r40.b(o5e.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, iwcVar), r40.b(o5e.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, iwcVar), r40.b(o5e.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1, iwcVar), r40.b(o5e.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1, iwcVar)};
        r5e<List<String>> r5eVar = k5e.a;
        r5e<r5<Function1<List<mif>, Boolean>>> r5eVar2 = v4e.a;
    }

    public static final void a(s5e s5eVar, String str) {
        s5eVar.a(k5e.K, str);
    }

    public static void b(s5e s5eVar, Function1 function1) {
        s5eVar.a(v4e.a, new r5(null, function1));
    }

    public static final void c(s5e s5eVar) {
        s5eVar.a(k5e.h, j6g.a);
    }

    public static final void d(s5e s5eVar, i92 i92Var) {
        r5e<i92> r5eVar = k5e.f;
        qf8<Object> qf8Var = a[22];
        s5eVar.a(r5eVar, i92Var);
    }

    public static final void e(s5e s5eVar, l92 l92Var) {
        r5e<l92> r5eVar = k5e.g;
        qf8<Object> qf8Var = a[23];
        s5eVar.a(r5eVar, l92Var);
    }

    public static final void f(s5e s5eVar, String str) {
        s5eVar.a(k5e.a, u63.Z(str));
    }

    public static final void g(s5e s5eVar, int i) {
        r5e<tz8> r5eVar = k5e.j;
        qf8<Object> qf8Var = a[3];
        s5eVar.a(r5eVar, new tz8(i));
    }

    public static final void h(s5e s5eVar, String str) {
        r5e<String> r5eVar = k5e.d;
        qf8<Object> qf8Var = a[2];
        s5eVar.a(r5eVar, str);
    }

    public static final void i(s5e s5eVar, int i) {
        r5e<qed> r5eVar = k5e.x;
        qf8<Object> qf8Var = a[13];
        s5eVar.a(r5eVar, new qed(i));
    }

    public static final void j(s5e s5eVar, boolean z) {
        r5e<Boolean> r5eVar = k5e.H;
        qf8<Object> qf8Var = a[21];
        s5eVar.a(r5eVar, Boolean.valueOf(z));
    }

    public static final void k(s5e s5eVar) {
        r5e<Boolean> r5eVar = k5e.m;
        qf8<Object> qf8Var = a[6];
        s5eVar.a(r5eVar, Boolean.TRUE);
    }

    public static final void l(s5e s5eVar, float f) {
        r5e<Float> r5eVar = k5e.s;
        qf8<Object> qf8Var = a[10];
        s5eVar.a(r5eVar, Float.valueOf(f));
    }
}
