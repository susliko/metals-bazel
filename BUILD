load("@io_bazel_rules_scala//scala:scala_toolchain.bzl", "scala_toolchain")
load("@io_bazel_rules_scala//testing/toolchain:toolchain.bzl", "scala_testing_toolchain")
load("@io_bazel_rules_scala//scala:providers.bzl", "declare_deps_provider")

scala_toolchain(
    name = "toolchain-scala_toolchain",
    scalacopts = [
                "-encoding",
                "UTF-8",
                "-feature",
                "-unchecked",
                "-deprecation",
                "-language:existentials",
                "-language:higherKinds",
                "-language:implicitConversions",
                "-Wunused:all"
                # "-Ytasty-reader"
            ],
    visibility = ["//visibility:public"],
    dependency_tracking_method = "ast",
    enable_diagnostics_report = True,
    dependency_mode = "plus-one",
    enable_semanticdb = True,
)

toolchain(
    name = "toolchain",
    toolchain = "toolchain-scala_toolchain",
    toolchain_type = "@io_bazel_rules_scala//scala:toolchain_type",
    visibility = ["//visibility:public"],
)


# scala_testing_toolchain(
#     name = "scala_testing_toolchain_impl",
#     dep_providers = [
#         ":scala_testing_classpath_provider",
#     ],
# )
#
# toolchain(
#     name = "scala_testing_toolchain",
#     toolchain = ":scala_testing_toolchain_impl",
#     toolchain_type = "@io_bazel_rules_scala//testing/toolchain:testing_toolchain_type",
# )
#
# declare_deps_provider(
#     name = "scala_testing_classpath_provider",
#     deps_id = "scalatest_classpath",
#     visibility = ["//visibility:public"],
#     deps = [ "@maven//:org_scalatest_scalatest_3" ],
# )
