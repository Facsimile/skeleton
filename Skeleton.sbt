// Facsimile -- A Discrete-Event Simulation Library
// Copyright © 2004-2016, Michael J Allen.
//
// This file is part of Facsimile.
//
// Facsimile is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later
// version.
//
// Facsimile is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
// warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
// details.
//
// You should have received a copy of the GNU Lesser General Public License along with Facsimile. If not,
// see http://www.gnu.org/licenses/lgpl.
//
// The developers welcome all comments, suggestions and offers of assistance. For further information, please visit the
// project home page at:
//
//   http://facsim.org/
//
// Thank you for your interest in the Facsimile project!
//
// IMPORTANT NOTE: All patches (modifications to existing files and/or the addition of new files) submitted for
// inclusion as part of the official Facsimile code base, must comply with the published Facsimile Coding Standards. If
// your code fails to comply with the standard, then your patches will be rejected. For further information, please
// visit the coding standards at:
//
//   http://facsim.org/Documentation/CodingStandards/
//======================================================================================================================
// SBT file to simplify publication to the Sonatype OSS repository.
//
// NOTE: This file is maintained as part of the Facsimile "skeleton" project, and is common to a number of other
// Facsimile projects, termed client projects. It must only be modified in the "skeleton" project, with changes being
// merged into client projects. Refer to the skeleton project for further details:
//
//   https://github.com/Facsimile/skeleton
//======================================================================================================================

import FacsimileBuild._

// ID of this Facsimile project.
//
// This is the "normalized name" of this project, also known as a Maven/SBT/Ivy artifact name (such as "myfabapp"). This
// must also match the name of the project on GitHub.
//
// NOTE: This is a test project, to ensure the SBT Skeleton settings compile, etc. It should not be published.
facsimileProjId in Global := "skeleton"

// Name of this Facsimile project.
//
// Human-readable phrase that describes (in a shortened form) this project (such as "My Fabulous App").
//
// This is equivalent to the "name" Maven POM information field, and is employed as such during deployment to the
// Sonatype OSS Nexus repository. It is also used by SBT for naming each project and sub-project.
facsimileProjName in Global := "Skeleton Test Project"

// Description of this Facsimile project.
//
// This is a more detailed description for this project.
facsimileProjDesc in Global := """
  Facsimile Skeleton project test configuration.
"""

// Home page of this Facsimile project.
facsimileProjHomePage in Global := "http://facsim.org/skeleton"

// SBT root module of this Facsimile project.
lazy val root = (project in file (".")).
settings (commonSettings: _*).
settings (rootSettings: _*).
settings (rootProjectUnidocSettings: _*)