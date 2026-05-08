package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class uwa extends mj8 implements wu5<Function2<? super b, ? super Integer, ? extends j6g>, b, Integer, j6g> {
    final /* synthetic */ zdf $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ d3a $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ Function2<b, Integer, j6g> $label;
    final /* synthetic */ Function2<b, Integer, j6g> $leadingIcon;
    final /* synthetic */ Function2<b, Integer, j6g> $placeholder;
    final /* synthetic */ Function2<b, Integer, j6g> $prefix;
    final /* synthetic */ dce $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ Function2<b, Integer, j6g> $suffix;
    final /* synthetic */ Function2<b, Integer, j6g> $supportingText;
    final /* synthetic */ Function2<b, Integer, j6g> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ ftg $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwa(d3a d3aVar, dce dceVar, zdf zdfVar, ftg ftgVar, String str, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z, boolean z2, boolean z3) {
        super(3);
        this.$value = str;
        this.$enabled = z;
        this.$singleLine = z2;
        this.$visualTransformation = ftgVar;
        this.$interactionSource = d3aVar;
        this.$isError = z3;
        this.$label = function2;
        this.$placeholder = function22;
        this.$leadingIcon = function23;
        this.$trailingIcon = function24;
        this.$prefix = function25;
        this.$suffix = function26;
        this.$supportingText = function27;
        this.$colors = zdfVar;
        this.$shape = dceVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.wu5
    public final j6g q(Function2<? super b, ? super Integer, ? extends j6g> function2, b bVar, Integer num) {
        Function2<? super b, ? super Integer, ? extends j6g> function22 = function2;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.x(function22) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && bVar2.i()) {
            bVar2.D();
        } else {
            String str = this.$value;
            boolean z = this.$enabled;
            boolean z2 = this.$singleLine;
            ftg ftgVar = this.$visualTransformation;
            d3a d3aVar = this.$interactionSource;
            boolean z3 = this.$isError;
            Function2<b, Integer, j6g> function23 = this.$label;
            Function2<b, Integer, j6g> function24 = this.$placeholder;
            Function2<b, Integer, j6g> function25 = this.$leadingIcon;
            Function2<b, Integer, j6g> function26 = this.$trailingIcon;
            Function2<b, Integer, j6g> function27 = this.$prefix;
            Function2<b, Integer, j6g> function28 = this.$suffix;
            Function2<b, Integer, j6g> function29 = this.$supportingText;
            zdf zdfVar = this.$colors;
            owa.a.c(str, function22, z, z2, ftgVar, d3aVar, z3, function23, function24, function25, function26, function27, function28, function29, zdfVar, null, bh2.c(2108828640, new twa(z, z3, d3aVar, zdfVar, this.$shape), bVar2), bVar2, (iIntValue << 3) & 112, 14155776, 32768);
        }
        return j6g.a;
    }
}
