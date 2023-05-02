#Senaryo :
#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption         | GradeLevelOption |
#| Math exam is1   | academicPeriod1              | gradeLevel2  |
#| IT exam is1     | academicPeriod1              | gradeLevel3  |
#| Oracle exam is1 | academicPeriod1              | gradeLevel4  |
#| Math exam is2   | academicPeriod1              | gradeLevel5  |
Feature: Exam functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Exam Create and Delete 5 times
    And Click on the element in LeftNav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <ExamName> |
    And Click on the element in Dialog
      | academicPeriod         |
      | <AcademicPeriodOption> |
      | gradeLevel             |
      | <GradeLevelOption>     |
    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in LeftNav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And User delete item from Dialog Content
      | <ExamName> |

    Then Success message should be displayed
    Examples:
      | ExamName      | AcademicPeriodOption | GradeLevelOption |
      | Math exam bu1 | academicPeriod1      | gradeLevel2      |
      | IT exam bu1   | academicPeriod1      | gradeLevel3      |
      | Java exam bu1 | academicPeriod1      | gradeLevel4      |
      | Math exam bu2 | academicPeriod1      | gradeLevel5      |
