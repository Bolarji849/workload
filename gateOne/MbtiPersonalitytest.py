final_result = ""
num_a_or_b = [[0, 0] for _ in range(4)]

def print_user_response(response, counts):
    for answer in response:
        print(answer)
    print("Number Of A Chosen:", counts[0])
    print("Number Of B Chosen:", counts[1])

def extrovert_vs_introvert():
    global final_result
    response = [None] * 5
    questions = [
        ["A: Expend energy, enjoy groups", "B: Conserve energy, enjoy one-on-one"],
        ["A: More outgoing, think out loud", "B: More reserved, think to yourself"],
        ["A: Seek many tasks, public activities", "B: Seek private, solitary activities"],
        ["A: External, communicate, express yourself", "B: Internal, reticent"],
        ["A: Active, initiative", "B: Reflective, deliberate"]
    ]
    
    count = 0
    for index in range(5):
        print(questions[index][0], questions[index][1])
        input_value = input("Enter your choice (A or B): ")
        if input_value.lower() in ["a", "b"]:
            if input_value.lower() == "a":
                count += 1
                response[index] = questions[index][0]
            else:
                response[index] = questions[index][1]
    final_result += "E" if count > 2 else "I"
    num_a_or_b[0] = [count, 5 - count]
    return response

def sensing_vs_intuitive():
    global final_result
    response = [None] * 5
    questions = [
        ["A: Interpret literally", "B: Look for meaning and possibilities"],
        ["A: Practical, realistic", "B: Imaginative, innovative"],
        ["A: Standard, usual", "B: Different, novel"],
        ["A: Focus on here-and-now", "B: Look to the future"],
        ["A: Facts, things", "B: Ideas, dreams"]
    ]
    
    count = 0
    for index in range(5):
        print(questions[index][0], questions[index][1])
        input_value = input("Enter your choice (A or B): ")
        if input_value.lower() in ["a", "b"]:
            if input_value.lower() == "a":
                count += 1
                response[index] = questions[index][0]
            else:
                response[index] = questions[index][1]
    final_result += "S" if count > 2 else "N"
    num_a_or_b[1] = [count, 5 - count]
    return response

def thinking_vs_feeling():
    global final_result
    response = [None] * 5
    questions = [
        ["A: Logical, thinking", "B: Empathetic, feeling"],
        ["A: Candid, straight-forward", "B: Tactful, kind"],
        ["A: Firm, tend to criticize", "B: Gentle, appreciate"],
        ["A: Tough-minded", "B: Tender-hearted"],
        ["A: Matter of facts", "B: Sensitive, people-oriented"]
    ]
    
    count = 0
    for index in range(5):
        print(questions[index][0], questions[index][1])
        input_value = input("Enter your choice (A or B): ")
        if input_value.lower() in ["a", "b"]:
            if input_value.lower() == "a":
                count += 1
                response[index] = questions[index][0]
            else:
                response[index] = questions[index][1]
    final_result += "T" if count > 2 else "F"
    num_a_or_b[2] = [count, 5 - count]
    return response

def judging_vs_perceptive():
    global final_result
    response = [None] * 5
    questions = [
        ["A: Organized, orderly", "B: Flexible, adaptable"],
        ["A: Plan, schedule", "B: Unplanned, spontaneous"],
        ["A: Regulated, structured", "B: Easy-going"],
        ["A: Preparation, plan ahead", "B: Go with the flow"],
        ["A  Control, govern", "B:  latitude, freedom"]
    ]
    
    count = 0
    for index in range(5):
        print(questions[index][0], questions[index][1])
        input_value = input("Enter your choice (A or B): ")
        if input_value.lower() in ["a", "b"]:
            if input_value.lower() == "a":
                count += 1
                response[index] = questions[index][0]
            else:
                response[index] = questions[index][1]
    final_result += "J" if count > 2 else "P"
    num_a_or_b[3] = [count, 5 - count]
    return response

def personality_type():
    descriptions = {
        "INTJ": "INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits.",
        "INTP": "INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits.",
        "ENTJ": "ENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and Judging traits.",
        "ENTP": "ENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits.",
        "INFJ": "INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits.",
        "INFP": "INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits.",
        "ENFJ": "ENFJ (Protagonist) is a personality type with the Extraverted, Intuitive, Feeling, and Judging traits.",
        "ENFP": "ENFP (Campaigner) is a personality type with the Extraverted, Intuitive, Feeling, and Prospecting traits.",
        "ISTJ": "ISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, and Judging traits.",
        "ISFJ": "ISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging traits.",
        "ESTJ": "ESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits.",
        "ESFJ": "ESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits.",
        "ISTP": "ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits.",
        "ISFP": "ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits.",
        "ESTP": "ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits.",
        "ESFP": "ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits."
    }
    print(descriptions.get(final_result, "Personality type not recognized."))


name = input("Enter your name: ")
response1 = extrovert_vs_introvert()
response2 = sensing_vs_intuitive()
response3 = thinking_vs_feeling()
response4 = judging_vs_perceptive()

print("Hello", name)
print_user_response(response1, num_a_or_b[0])
print_user_response(response2, num_a_or_b[1])
print_user_response(response3, num_a_or_b[2])
print_user_response(response4, num_a_or_b[3])

print("Your MBTI Personality Type:", final_result)
personality_type()
