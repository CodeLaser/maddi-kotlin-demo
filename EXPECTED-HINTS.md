# Expected hints

What maddi's IDE daemon computes for every declaration of this project, with the annotations in the order the
daemon sends them. *Hidden by default* marks a context default: the plugin's default inline-hints mode ("Hide
context defaults") leaves it out, while the gutter and "Show all" keep it. Declarations without any verdict are
not listed. Types are named as the JVM sees them: a companion object's functions under `Companion`, top-level
functions under the file's facade class (`StringsKt`), and parameter types as Java types.

Produced on 2026-10-27 by running the daemon's analysis (maddi 0.9.6 development build) over `src/main/kotlin`.
After an analyzer change, the differences from this file are the point of the exercise.

## `demo.eventual.Config`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Immutable(hc=true,after="host,port")`, `@FinalFields` |
| property host | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| property port | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| host() | `@NotModified`, `@Only(after="host")`, `@NotNull` *(hidden by default)* |
| init(String,int) | `@Mark("host,port")`, `@Modified` *(hidden by default)* |
| port() | `@NotModified`, `@Only(after="port")` |
| param h of init(String,int) | `@NotNull` *(hidden by default)* |

## `demo.eventual.Document`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Immutable(hc=true,after="text")`, `@FinalFields` |
| property text | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| commit(String) | `@Mark("text")`, `@Modified` *(hidden by default)* |
| edit(String) | `@Only(before="text")`, `@Modified` *(hidden by default)* |
| isCommitted() | `@NotModified`, `@TestMark("text")` |
| length() | `@NotModified(after="text")`, `@Modified` *(hidden by default)* |
| param s of commit(String) | `@Nullable` |
| param s of edit(String) | `@Nullable` |

## `demo.guard.WrongContainer`

| Declaration | Hints |
|---|---|
| (type) | `@Immutable` |
| fill(List) | `@NotModified` *(hidden by default)* |
| param target of fill(List) | `@Independent` *(hidden by default)*, `@Modified`, `@NotNull` *(hidden by default)* |

## `demo.guard.WrongImmutable`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@FinalFields` |
| property items | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| add(String) | `@Modified` *(hidden by default)* |
| param s of add(String) | `@Nullable` |

## `demo.immutable.Circle`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer` |
| area() | `@NotModified` *(hidden by default)* |

## `demo.immutable.Color`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer` |
| property BLUE | `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| property GREEN | `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| property RED | `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| next() | `@Independent` *(hidden by default)*, `@Modified` *(hidden by default)* |

## `demo.immutable.LazyName`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| property name | `@NotNull` *(hidden by default)* |
| name() | `@Modified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param name of constructor(String) | `@NotNull` *(hidden by default)* |

## `demo.immutable.Pair`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer(hc=true)` |
| property first | `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)* |
| property second | `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)* |
| swap() | `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param first of constructor(Object,Object) | `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)* |
| param second of constructor(Object,Object) | `@Independent(hc=true)` *(hidden by default)*, `@NotModified` *(hidden by default)* |

## `demo.immutable.Point`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer` |
| manhattan() | `@NotModified` *(hidden by default)* |
| translate(int,int) | `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |

## `demo.immutable.Shape`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer(hc=true)`, `@Independent` |
| area() | `@NotModified` *(hidden by default)* |

## `demo.immutable.Snapshot`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@FinalFields`, `@Dependent` *(hidden by default)* |
| property lines | `@NotModified` *(hidden by default)*, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| count() | `@NotModified` |
| param lines of constructor(List) | `@Independent`, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |

## `demo.immutable.Tags`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@FinalFields` |
| property owner | `@NotNull` *(hidden by default)* |
| property tags | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| count() | `@NotModified` |
| tag(String) | `@Modified` *(hidden by default)* |
| param owner of constructor(String) | `@NotNull` *(hidden by default)* |
| param tag of tag(String) | `@Nullable` |

## `demo.independence.Box`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent(hc=true)`, `@Mutable` *(hidden by default)* |
| property content | `@Independent(hc=true)`, `@NotModified` *(hidden by default)* |
| param content of constructor(Object) | `@Independent(hc=true)`, `@NotModified` *(hidden by default)* |

## `demo.independence.Inventory`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@FinalFields`, `@Dependent` *(hidden by default)* |
| property items | `@Modified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| add(String) | `@Modified` *(hidden by default)* |
| copy() | `@Independent`, `@NotModified`, `@NotNull` *(hidden by default)* |
| exposed() | `@NotModified`, `@GetSet("items")`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| view() | `@UnmodifiableView`, `@NotModified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param item of add(String) | `@Nullable` |

## `demo.independence.Wrapper`

| Declaration | Hints |
|---|---|
| (type) | `@FinalFields`, `@Dependent` *(hidden by default)* |
| property list | `@Modified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| append(String) | `@Modified` *(hidden by default)* |
| param list of constructor(List) | `@Modified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param s of append(String) | `@Nullable` |

## `demo.method.Checks`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer` |
| orDefault(String,String) | `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| requireNonNull(Object,String) | `@Identity`, `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)* |
| requirePositive(int) | `@Identity`, `@NotModified` *(hidden by default)* |
| param dflt of orDefault(String,String) | `@NotNull` *(hidden by default)* |
| param s of orDefault(String,String) | `@Nullable` |
| param t of requireNonNull(Object,String) | `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)* |
| param what of requireNonNull(Object,String) | `@Nullable` |

## `demo.method.Person`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| property name | `@NotNull` *(hidden by default)* |
| param name of constructor(String,int) | `@NotNull` *(hidden by default)* |

## `demo.method.Ranges`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer` |
| span(int,int) | `@NotModified` *(hidden by default)* |

## `demo.method.Sentence`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@FinalFields` |
| property sb | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| build() | `@NotModified`, `@NotNull` *(hidden by default)* |
| period() | `@Fluent`, `@Independent`, `@Modified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| word(String) | `@Fluent`, `@Independent`, `@Modified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param w of word(String) | `@Nullable` |

## `demo.modification.Bag`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@FinalFields` |
| property items | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| add(String) | `@Modified` *(hidden by default)* |
| contains(String) | `@NotModified` |
| size() | `@NotModified` |
| param item of add(String) | `@Nullable` |
| param item of contains(String) | `@NotNull` *(hidden by default)* |

## `demo.modification.Counter`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| inc() | `@Modified` *(hidden by default)* |
| reset() | `@Modified` *(hidden by default)* |
| value() | `@NotModified`, `@GetSet("count")` |

## `demo.modification.Elements`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@FinalFields`, `@Dependent` *(hidden by default)* |
| property items | `@Modified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| Companion.addTo(List,Item) | `@NotModified` *(hidden by default)* |
| Companion.touchAll(List) | `@NotModified` *(hidden by default)* |
| addOwn(Item) | `@Modified` *(hidden by default)* |
| touchOwn() | `@Modified(hc=true)` |
| param item of Companion.addTo(List,Item) | `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@Nullable` |
| param item of addOwn(Item) | `@NotModified` *(hidden by default)*, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param list of Companion.addTo(List,Item) | `@Independent` *(hidden by default)*, `@Modified`, `@NotNull` *(hidden by default)* |
| param list of Companion.touchAll(List) | `@Independent` *(hidden by default)*, `@Modified(hc=true)`, `@NotNull` *(hidden by default)* |

## `demo.modification.Item`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| touch() | `@Modified` *(hidden by default)* |

## `demo.modification.ListTools`

| Declaration | Hints |
|---|---|
| (type) | `@Immutable` |
| addTwice(List,String) | `@NotModified` *(hidden by default)* |
| first(List) | `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| sortInPlace(List) | `@NotModified` *(hidden by default)* |
| param list of addTwice(List,String) | `@Independent` *(hidden by default)*, `@Modified`, `@NotNull` *(hidden by default)* |
| param list of first(List) | `@Independent` *(hidden by default)*, `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param list of sortInPlace(List) | `@Independent` *(hidden by default)*, `@Modified`, `@Nullable` |
| param s of addTwice(List,String) | `@Nullable` |

## `demo.modification.Registry`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@FinalFields`, `@Dependent` *(hidden by default)* |
| property ids | `@Modified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| clear() | `@Modified` *(hidden by default)* |
| lookup(String) | `@Independent`, `@NotModified`, `@Nullable` |
| register(String,int) | `@Modified` *(hidden by default)* |
| param name of lookup(String) | `@Nullable` |
| param name of register(String,int) | `@Nullable` |

## `demo.nullability.Lookup`

| Declaration | Hints |
|---|---|
| (type) | `@FinalFields`, `@Dependent` *(hidden by default)* |
| property entries | `@NotModified`, `@Dependent` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| describe(String) | `@NotModified`, `@NotNull` *(hidden by default)* |
| find(String) | `@NotModified`, `@Nullable` |
| findOrEmpty(String) | `@NotModified`, `@NotNull` *(hidden by default)* |
| name(String) | `@NotModified` |
| param entries of constructor(Map) | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| param key of find(String) | `@NotNull` *(hidden by default)* |
| param key of findOrEmpty(String) | `@NotNull` *(hidden by default)* |
| param s of describe(String) | `@Nullable` |
| param s of name(String) | `@NotNull` *(hidden by default)* |

## `demo.rare.Audit`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| property buffer | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| add(int) | `@Modified` *(hidden by default)* |
| log(String) | `@IgnoreModifications`, `@Modified` *(hidden by default)* |
| twice(int) | `@NotModified` |
| param s of log(String) | `@Nullable` |

## `demo.rare.Clock`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| tick() | `@Modified` *(hidden by default)* |

## `demo.rare.Report`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@FinalFields` |
| property sb | `@Independent`, `@Modified`, `@NotNull` *(hidden by default)* |
| build() | `@NotModified`, `@Finalizer`, `@NotNull` *(hidden by default)* |
| line(String) | `@Fluent`, `@Independent`, `@Modified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param s of line(String) | `@Nullable` |

## `demo.rare.Settings`

| Declaration | Hints |
|---|---|
| (type) | `@Container`, `@Independent`, `@Mutable` *(hidden by default)* |
| raise() | `@Modified` *(hidden by default)* |

## `demo.rare.SettingsClient`

| Declaration | Hints |
|---|---|
| (type) | `@ImmutableContainer` |
| bump() | `@StaticSideEffects`, `@NotModified` *(hidden by default)* |
| compute(int) | `@NotModified` *(hidden by default)* |
| configure() | `@NotModified` *(hidden by default)* |

## `demo.rare.StringsKt`

| Declaration | Hints |
|---|---|
| isPalindrome(String) | `@NotModified` *(hidden by default)* |
| reversed2(String) | `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| twice(String) | `@NotModified` *(hidden by default)*, `@NotNull` *(hidden by default)* |
| param receiver of isPalindrome(String) | `@NotNull` *(hidden by default)* |
| param receiver of reversed2(String) | `@NotNull` *(hidden by default)* |
| param receiver of twice(String) | `@Nullable` |

## Guard findings

- `guard/WrongContainer.kt:11`: parameter 'target' of demo.guard.WrongContainer.fill(java.util.List) is modified, violating the @Container contract on demo.guard.WrongContainer
- `guard/WrongImmutable.kt:11`: field 'items' of demo.guard.WrongImmutable is modified, violating rule 1 (all fields @NotModified) of the @Immutable contract on demo.guard.WrongImmutable
