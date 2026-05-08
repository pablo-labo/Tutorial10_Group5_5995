package defpackage;

import com.indeed.android.messaging.data.conversations.AttachmentsRepository;
import com.indeed.android.uiplugin.file.FileTooLargeException;
import java.io.File;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$uploadAttachment$1", f = "SelectedConversationViewModel.kt", l = {350}, m = "invokeSuspend")
public final class n2e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ File $file;
    int label;
    final /* synthetic */ y1e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2e(y1e y1eVar, File file, lu2<? super n2e> lu2Var) {
        super(2, lu2Var);
        this.this$0 = y1eVar;
        this.$file = file;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new n2e(this.this$0, this.$file, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((n2e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object value;
        n2e n2eVar = this;
        int i = n2eVar.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                gse gseVar = n2eVar.this$0.c0;
                do {
                    value = gseVar.getValue();
                } while (!gseVar.h(value, x1e.a((x1e) value, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, false, 0, null, null, null, null, false, null, 67108351)));
                y1e y1eVar = n2eVar.this$0;
                AttachmentsRepository attachmentsRepository = y1eVar.c;
                File file = n2eVar.$file;
                String str = (String) y1eVar.W.getValue();
                n2eVar.label = 1;
                Object objUploadAttachment = attachmentsRepository.uploadAttachment(file, str, n2eVar);
                g13 g13Var = g13.a;
                n2eVar = objUploadAttachment;
                if (objUploadAttachment == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                n2eVar = n2eVar;
            }
        } catch (FileTooLargeException unused) {
            fnf.h(n2eVar.this$0.e, cnf.e, null, null, 6);
        }
        return j6g.a;
    }
}
