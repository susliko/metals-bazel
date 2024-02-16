load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

package(
    default_visibility = ["//visibility:public"],
)

scala_library(
    name = "foobar",
    srcs = glob(["src/main/scala/**/*.scala"]),
    deps = [
      "@maven//:org_typelevel_cats_effect_3",
    ]
)


