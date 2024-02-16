load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

scala_binary(
    name = "gogo",
    srcs = glob(["src/main/scala/**/*.scala"]),
    main_class = "gogo.Gogo",
    deps = [
      "@maven//:org_typelevel_cats_core_3",
      "@maven//:org_typelevel_cats_effect_3",
      "//foobar:foobar"
    ]
)

scala_test(
    name = "gogotest",
    srcs = glob(["src/test/scala/**/*.scala"]),
    deps = [
      "@maven//:org_typelevel_cats_core_3",
      "@maven//:org_typelevel_cats_effect_3",
      "@maven//:org_scalatest_scalatest_3",
    ]
)

